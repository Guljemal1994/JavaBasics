package class23_RunTime_Polymorphism;

public class Notes {

	/*
	 * MethodOverloading---> having same method name within same class
	 * 
	 * Method Overriding ---> having same method name within Super and Subclass
	 * 
	 * In Overload method sibnature is DIFFERENT 1.number of parameter,
	 *                                           2.type od parameters 
	 *                                           
	 *  in Overriding method signature is SMAE:1.Inheratence is Must
	 *                                         2.Return type MUST be same
	 *                                         3.Access modifiers cannot be decreased, can stay same or can
	 *                                         be increased in child class
	 *  
	 *  
	 * Java supports 2 types of polomorphism 
	 *       1. Compile Time/static binding /early binding-->achieved through method overloading
	 *       2.RUNTIME --> dynamic binding/late binding-->achieved through method overriding                                        
	 *      
	 * When two static methods with same name available in parent and child class------> we are not 
	 * overriding we are achieving methodhiding     
	 * 
	 * 
	 * Can we override static ? no                         Can we overload static?? Yeees
	 * Can ve override private? Nooooo                     Can we OverLoad private ?  Yeeeeeees
	 *  
	 * -*-*-*-*-*--************************************-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**
	 * 
	 * final keyword ---> means and cannot be modified.
	 * 
	 *  final can be used with: variable, method , class 
	 *  
	 *  final is non access modifier.(static , abstract);
	 *  
	 *  Synatx FOR VARIABLES
	 *  
	 *  access modifier non access modifier dataTypes name;
	 *  
	 *  
	 *  SYNTAX FOR METHODS
	 *   
	 *  access mofifier non access ReturnType name();
	 *  
	 *  
	 *  final is a non-access modifier applicable only to a variable, a method or a class.
	 *  In Java, the final keyword can be used while declaring an entity. 
	 * 
	 *  This entity can be - but is not limited to - a variable, a class or a method.
	 * 
	 *  if we make any variable as final, you cannot change the value of final variable(It will be constant).
	 *  3. A final method cannot be overridden. Which means even though a sub class can call the 
	 *     final method of parent class without any issues but it cannot override it.
     *  
	 *  1. Using the final keyword means somthing is completed and cannot modified in the future. 
	 *  Points of final keyword: 
	 *  2.1) A constructor cannot be declared as final.
          2) Local final variable must be initializing during declaration.
         3) All variables declared in an interface are by default final.
         4) We cannot change the value of a final variable.
         5) A final method cannot be overridden.
         6) A final class not be inherited.
         7) If method parameters are declared final then the value of these parameters cannot be changed.
         8)final is non access modifier.(static , abstract);
	  
	 *  
	 *  */
}
