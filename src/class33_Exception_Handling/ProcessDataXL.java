package class33_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProcessDataXL {

	public static void main(String[] args) throws IOException {

		String file = "C:\\Users\\konul\\OneDrive\\Documents\\Test.xlsx";
		FileInputStream fis = new FileInputStream(file);
		
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("TestData");
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		
		List<Map<String, String>> xlData = new ArrayList<>();
		
		for(int r = 1; r<rows; r++) {
			Map<String,String> map = new LinkedHashMap<>();
			
			for(int c=0; c<cols; c++) {
				String key = sheet.getRow(0).getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key,value);
			}
			
			
			xlData.add(map);
		}
		
		
		System.out.println(xlData);
		
		System.out.println("----accessing each map separatly--------");
		
		for(Map<String,String> map:xlData) {
			System.out.println(map);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
