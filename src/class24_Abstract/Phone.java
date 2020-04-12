package class24_Abstract;

public abstract class Phone {

	//implimented method
	public void call() {
		System.out.println("Phone can make a call");
	}
	public void test() {
		System.out.println("Phone can send text");
	}
	//unimplimented methods or unfined method abstracts methods
	public abstract void takePicture();
	
	public abstract void playMusic();
}

class iPhone extends Phone{

	@Override
	public void takePicture() {
		System.out.println("iPhone take pictures");
	}

	@Override
	public void playMusic() {
		System.out.println("iPhone play music using apple store");
	}
}

class Samsung extends Phone{

	@Override
	public void takePicture() {
		System.out.println("Samsung takes pictures");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung palys music using google store");
	}
	
	
}
