package class29_Set_and_MapInterface;

abstract class Coverage{
	public void method() {
		System.out.println("Method of coverage class");
	}
}
public abstract class Insurance extends Coverage {

	String insuranceName;//instance variable
	
	Insurance(String insuranceName){
		this.insuranceName = insuranceName;
	}
	public abstract void getQuote();
	public abstract void cancelInsuranse();
}
class Car extends Insurance{

	String carModel;
	Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}
	@Override
	public void getQuote() {
		System.out.println("$1600 offered for 6 month insurance from "+insuranceName+" for "+carModel);
	}
	@Override
	public void cancelInsuranse() {
		System.out.println("Due to pther offers "+insuranceName+"'s offer for  "+carModel+" is car");	
	}
	public void display() {
		System.out.println("Car = "+carModel);
	}
}
class Pet extends Insurance{

	String petType;
	Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	@Override
	public void getQuote() {
	System.out.println("offers are too high for "+petType+" from "+insuranceName+" insuranse");
		
	}

	@Override
	public void cancelInsuranse() {
		System.out.println("Canceled due to high prices");
	}
}
class Health extends Insurance{

	Health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println("Brown family got 1500$ offer from "+insuranceName+" insuranse company for family health");
	}

	@Override
	public void cancelInsuranse() {
		System.out.println("Please contact for castomer service "+insuranceName+"'s insurans company");
		
	}
	
}
