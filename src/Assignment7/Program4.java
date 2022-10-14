package Assignment7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program4 {

	public static void main(String[] args) throws IOException {
		//		To fetch data from ExcelSheet(.xlsx)
		File file = new File("FilesForTesting\\DemoFile.xlsx");
		FileInputStream fileStream = new FileInputStream(file);
		XSSFWorkbook workBook= new XSSFWorkbook(fileStream);
		XSSFSheet sheet = workBook.getSheet("City");
		int row = sheet.getLastRowNum();
		List<String> list = new ArrayList<String>();
		for (int i=0;i<=row;i++) {
			String str = sheet.getRow(i).getCell(0).getStringCellValue();
			list.add(str);
		}
		System.out.println("Data fetched from Excel: ");
		for (String word : list) {
			System.out.println(word);
		}

		//      To write in Text file
		File file1 = new File("FilesForTesting\\File1.txt");
		try {
			FileWriter fw = new FileWriter(file1, true);
			String lineSeparator = System.getProperty("line.separator");
			for (String eachString : list) {
				fw.write(eachString);
				fw.write(lineSeparator);
			}
			fw.flush();
			fw.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Successfully written in text file");
	}

}
