package typesofvariable;

public class Localnonstaticvariable {
	
	public static void main(String[] args) {
		
		Localnonstaticvariable.m1();
		
		Localnonstaticvariable nsv=new Localnonstaticvariable();
		nsv.m2();
		
		
	}
	
	
public static void m1() {
	
	int number= 200;// non static Local variable
	//static int number = we cannot declared static variables inside the main method 
	//body or any kind of method of the class
	
	System.out.println(number);
	number=300;
	System.out.println(number);
}

public  void m2() {
	int number = 100;
String name= "Rahul";
System.out.println(name);
System.out.println(number);
	
}
}


