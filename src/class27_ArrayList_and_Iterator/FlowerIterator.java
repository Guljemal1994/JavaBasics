package class27_ArrayList_and_Iterator;

public  abstract class FlowerIterator {
//define flower class that will have String type,
	//constractor that initiazlize a variable and undefine method bloom

	public String type;

	public FlowerIterator(String type) {
		this.type = type;
	}
   public abstract void bloom();
}
class Tulip extends FlowerIterator {

	public Tulip(String type) {
		super(type);

	}
    @Override
	public void bloom() {
		System.out.println(type + " blooms in March");
	}
}
class Rose extends FlowerIterator {

	public Rose(String type) {
		super(type);
	}
	@Override
	public void bloom() {
		System.out.println(type + " blooms in June");
	}
}
class SunFlower extends FlowerIterator {

	public SunFlower(String type) {
		super(type);
	}
	@Override
	public void bloom() {
		System.out.println(type + " blooms in August");
	}
}