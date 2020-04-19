package class25_Interface;

public interface GulInterface {

	void  MyInterface();
}
class Method1 implements GulInterface{

	@Override
	public void MyInterface() {
		System.out.println("implementation of method1");
		
	}
}
class Method2 implements GulInterface{

	@Override
	public void MyInterface() {
		System.out.println("implementation of method2");
	}
}