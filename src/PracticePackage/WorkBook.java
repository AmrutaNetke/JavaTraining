package PracticePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WorkBook {

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\ExcelFolder\\ExcelFile.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Credentials");
		Iterator<Row> itr = sheet.iterator();
		while(itr.hasNext()) {
			Row row= (Row) itr.next();
			Iterator<Cell> cellIerator=row.cellIterator(); 
			while(cellIerator.hasNext()) {
				Cell cell = cellIerator.next();
				System.out.println(cell.getStringCellValue());
			}
			System.out.println();
		}
	}

}
