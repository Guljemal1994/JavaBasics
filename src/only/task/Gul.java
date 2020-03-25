package only.task;

class Main{
	  public static void main(String[] args) {
			
			  Main obj = new Main();
			  System.out.println(obj.spaceOut("computer science"));
			  System.out.println(obj.spaceOut("trick or treat"));
			 }
		  String spaceOut(String s) {
			  String text="";
			  for(int i=0; i <s.length(); i++) {
				  text += s.charAt(14);
			  }
		       return text;
		  }
	}
