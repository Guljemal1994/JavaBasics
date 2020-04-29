package class32_Excel_Reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadEcel {

	public static void main(String[] args) throws IOException {

		String filepath = "C:\\Users\\konul\\OneDrive\\Documents\\Test.xlsx";

		FileInputStream fis = new FileInputStream(filepath);

		// get an Object of Workbook type
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");

		// we need to find numbers of rows
		int rows = sheet.getPhysicalNumberOfRows();

		// find number of column
		int cols = sheet.getRow(0).getLastCellNum();

		// to get data from all rows and all colums
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				String cellVal =sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+" - ");
             }
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
