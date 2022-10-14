package PracticePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_xlxsFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("FilesForTesting\\DemoFile.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		try {
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheet("City");
		Iterator<Row> itr = sheet.iterator();
		while(itr.hasNext()) {
			Row row= (Row) itr.next();
			Iterator<Cell> cellIerator=row.cellIterator(); 
			while(cellIerator.hasNext()) {
			Cell cell = cellIerator.next();
			if(cell.getCellType().equals("string")) {
			System.out.println(cell.getStringCellValue());
			}
			else {
				System.out.println(cell.getNumericCellValue());
			}
			}
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
