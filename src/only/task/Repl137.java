package only.task;

public class Repl137 {

	
	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;

	Repl137(String makee,String modell,int numberOfDoorss,int topSpeedd,double pricee){
	  
	  make = makee;
	  model = modell;
	  numberOfDoors = numberOfDoorss;
	  topSpeed = topSpeedd;
	  price = pricee;
	  
	}

	Repl137(String makee,String modell,int topSpeedd,double pricee){
	  make =makee;
	  model =modell;
	  topSpeed = topSpeedd;
	  price = pricee;
	  numberOfDoors =4;
	  
	}

	Repl137(int numberOfDoorss,int topSpeedd,double pricee){
	  
	  make ="unknown";
	  model ="unknown";
	  numberOfDoors = numberOfDoorss;
	  topSpeed = topSpeedd;
	  price = pricee;
	  
	}

	Repl137(String makee,String modell,int numberOfDoorss){
	  make = makee;
	  model = modell;
	  numberOfDoors = numberOfDoorss;
	  topSpeed =90;
	  price =0;
	}

	void display(){
	  System.out. println(make + " " + model + " "+ numberOfDoors +" "+ topSpeed + " " + price);
	}
	}
	
	
	
	
	
	

