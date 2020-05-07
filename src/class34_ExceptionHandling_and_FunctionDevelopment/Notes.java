package class34_ExceptionHandling_and_FunctionDevelopment;

public class Notes {
	/*
	 * Exception: checked:FileNotFound, IOException, InterruotedException;
	 * unchecked: NullPointerException,
	 * ArtithmeticExcetion,ArrayIndexOutBoundException;
	 *  NullPointerException ----> NullPointerException is a RuntimeException . 
	 * In Java, a special null value can be assigned to an object reference. NullPointerException is thrown when
	 * an application attempts to use an object reference that has the null value.
	 * These include: Calling an instance method on the object referred by a null
	 * reference.
	 * 
	 * To handle an Exception:
	 * Keyword associated with Exception:
	 * try - block that contains proplematic code/code that might throw an exepton;
	 * catch - block that catches an exception. We can have miltiple catch b;ocks;
	 * finally - ;
	 * throw;
	 * throws;
	 * 
	 * 
	 * ===========================================================================================================
	 * InetviweQ:
	 * finally vs final vs finalize():::
	 * 
	 * finally - is a block that assosiated with try block 
	 *  
	 *  final is a keyword and it is a non access modifier that is associated with class, method or variable;
	 * 
	 *Final : class could not be inherited , final method could not be overridden . 
	 * final variable could not be changed/constant
	 * 
	 * finalize() - is just method associated with garbage collection process. This method is executed before
	 * Object gets destroyed from a heap memoty;
	 * 
	 *  
	 * -----------------------------------------------------------------------------------------------------------
	 * throws is a keyword in java language which is used to throw the exception which is raised in the called method 
	 * to it's calling method throws keyword always followed by method signature“throws keyword” is mainly
	 *  used for handling checked exception as using throws we can declare multiple exceptions.
	 *  It gives an information to the programmer that there may occur an exception so it is better for the 
	 *  programmer to provide the exception handling code so that normal flow can be maintained.
	 * 
	 * 
	 * throws --  keyword used for handling checked exception as using throws we can declare multiple exceptions.
	 * thwors is used to delegate responsibility of handling an Exception to the caller (Another method, JVM);
	 * 
	 * 
	 * throw -  is keyword;
	 * 
	 * 
	 */
}
