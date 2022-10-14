package Assignment7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;

public class Program2 {

	public static void main(String[] args) throws IOException {
		File file = new File("FilesForTesting\\SampleExcelWorkBook.xls");
		FileInputStream fileStream = new FileInputStream(file);
		HSSFWorkbook workBook= new HSSFWorkbook(fileStream);
		HSSFSheet sheet = workBook.getSheet("StudentsFile");
		
		Iterator<Row> rowIterator= sheet.iterator();
		while(rowIterator.hasNext()) {
			Row row=rowIterator.next();
			Iterator<Cell> cellIterator= row.iterator();
			while(cellIterator.hasNext()) {
				Cell cell=cellIterator.next();
				System.out.print(cell+"\t");
			}
			System.out.println();
			
		}
	}


}


