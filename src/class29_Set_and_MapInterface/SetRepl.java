package class29_Set_and_MapInterface;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetRepl {
	
	
	String stName, lastName;
	int stId;
	
	SetRepl(int stId, String stName, String lastName ){
		
		this.stName = stName;
		this.lastName = lastName;
		this.stId = stId;
	}
	public void display() {
		System.out.println("Student details: "+stName+" "+lastName+" with id: "+stId);
	}
	
public static void main(String[] args) {
	
	Set<SetRepl> set = new LinkedHashSet<>();
	
	set.add(new SetRepl(101,"Samir","Jawaid"));
	set.add(new SetRepl(102,"Asel","Umurzakova"));
	set.add(new SetRepl(103,"Diego","Juarez"));
	set.add(new SetRepl(104,"Sohil","Aryan"));
	set.add(new SetRepl(105,"Alijon","Nazarov"));
	Iterator<SetRepl> hs = set.iterator();
	while (hs.hasNext()) {
		SetRepl s = hs.next();
		s.display();
	}
	
}
}
