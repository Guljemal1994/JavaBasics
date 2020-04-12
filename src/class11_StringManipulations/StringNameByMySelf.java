package class11_StringManipulations;

public class StringNameByMySelf {

	public static void main(String[] args) {
		
		String name = "Guljemal is 25 yers ols";
		//name.length nace harp bardygyny aytyar
		System.out.println(name.length());
		System.out.println(name.toLowerCase());//hemmesini kici harp bn yazmak un 
		System.out.println(name.toUpperCase());//hemmesini uly harp bn yazmak un
		System.out.println(name.indexOf("25"));//25in nacinji yerde duranlygyny bilmek ucin
		System.out.println(name.indexOf("kim"));//hokman yaz name un -1cykaryar
		//NOTE  
		//%d is for int
		//%s is for String
		//%fis for float
		
		System.out.println("===Second example====with int and string====");
		//adyn bilen yasyny bile cyarjak bolsasn 
		String namee = "Julia is %d years old";//%d goymaly output da yasyny gormek un
		int age = 25;
		System.out.printf(namee, age);//we printf yazmaly name bilen age goyyan 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
