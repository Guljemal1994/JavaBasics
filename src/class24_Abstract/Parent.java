package class24_Abstract;

public abstract class Parent {

	String tea;
	int add;
	   Parent(String tea,int add){
	     this.tea = tea;
	     this.add = add;
	   }
	  public abstract void addSuger();
	}
class Child extends Parent{

		Child(String tea,int add) {
			super(tea,add);
		}
       @Override
		public void addSuger() {
		   System.out.println("For "+tea+"we need"+add+ " spoons of suger");
		}
	  }
class Chil1 extends Parent{

	Chil1(String tea,int add) {
		super(tea, add);
	}

	@Override
	public void addSuger() {
	   System.out.println("For"+tea+" we need"+add+" spoon of sugar");	
	}
}


