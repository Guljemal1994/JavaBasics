package class33_Exception_Handling;

public class Notes {
	/*
	 * Filehandling in java we use FileInputStrem , FileOutputStream.
	 * 
	 * Why?? To store configuration data or test data and anytime we need to make a
	 * change we can do it without making change to the source code .
	 * 
	 * We used .properties file to store configurtion data: browser,url,uid, pwd; To
	 * work with properties file we need Properties Class
	 * 
	 * We used xlfile to store test data and to work with Excel file we used Apache
	 * POI
	 * 
	 * XSSFWorkbook - .xlsx HSSSFWorkbook - .xls
	 * 
	 * Sheet , Row , Cell;
	 * 
	 * How do you handle data drom xlfile: 1.Specify/locate path to the file;
	 * 2.Create an object of FileInputStream; 3.Create an object of Workbook
	 * type(XSSFWorkbook); 4.Get a Sheet by name or index;
	 * 
	 * 
	 * How to store XL Data into JAva Data Structure;
	 * 
	 * Get number of rows and cells (using sheet we get #of physical rows, from each
	 * row we can get number of cells); Create any empty object of List<Map<K,V>>
	 * Using nexted for loop we iterate over rows and colums Outer loop iterates
	 * over rows: Create an object of a Map<K,V> using inner loop iterate over
	 * columns--store/put key and value into map;
	 * 
	 * Before going to the next row we store map into the List;
	 * 
	 * When do we use iterator??- that method only avaiable only for collections.
	 * 
	 * 
	 * 
	 * -----------------------------------------------------------------------------
	 * ------------------------------------------------------- 
	 * An Exception is an event, which occurs during the execution of a program, that disrupts the
	 * normal flow. Exception is an object which is thrown at runtime. 
	 *  ALL EXCEPTIONS OCCUR DURING RUNTIME; 
	 *
	 * 2 Types of Exceptions: Checked - e that are
	 * checked by the compiler. Compiler make a programmer aware that some exception
	 * might occur and you need to tell how you want to handle it. Examples:
	 * FileNotFound, IOException, InterruptedException
	 * 
	 * Unchecked/runtime - e that are not checked by a compiler and programmr will
	 * know if they occur or not inly druing runtime but never during compilation
	 * Examples: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundException 
	 * 
	 * 
	 * 
	 * 
	 * To handle an E we need to use try and catch
	 * block try block - code that might throw an exception catch block -
	 * hanldes/catches object of thrown exception new NullPointerException(); new
	 * ArithmeticException(); new InterruptedException(); Once we caugth the
	 * exception we can specify details of an E in 
	 * 3 different way: Throwable class
	 * provide 3 method to see details: .printStackTrace();//name, message about E,
	 * where it occurs System.out.println(se);//name, message about E
	 * System.out.println(se.getMessage());
	 *
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
