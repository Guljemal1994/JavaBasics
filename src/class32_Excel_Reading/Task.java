package class32_Excel_Reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {

	public static void main(String[] args) throws IOException {
		
		String filepath = "C:\\Users\\konul\\OneDrive\\Documents\\Test.xlsx";

		FileInputStream fis = new FileInputStream(filepath);

		// get an Object of Workbook type
		Workbook book2 = new XSSFWorkbook(fis);
		Sheet sheet2 = book2.getSheet("Sheet2");

		
		
		
		
		
		

	}

}
