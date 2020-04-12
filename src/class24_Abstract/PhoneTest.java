package class24_Abstract;

public class PhoneTest {

	public static void main(String[] args) {
		
	//new Phone(); CE: cannot instantiate/create an object of Phone class
	//because it is ABSTRACT 
		
	Phone iphone = new iPhone();
		iphone.call();
		iphone.test();
		iphone.takePicture();
		iphone.playMusic();
		
		System.out.println("+-+-+-++-+-+-+-+-+-++-+-+-+-+-");
		Phone sam = new Samsung();
		   sam.call();
		   sam.test();
		   sam.takePicture();
		   sam.playMusic();

	}

}
