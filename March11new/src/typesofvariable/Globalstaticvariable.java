package typesofvariable;

public class Globalstaticvariable {
	
	static int number= 20;  //static Global variable
	
	
	static String name= "Rohit";
	
	int number1= 200;// non static Global variable
	public static void main(String[] args) {
		
		Globalstaticvariable.m4();
		
		Globalstaticvariable Gsv= new Globalstaticvariable();
		Gsv.m5();
		
	}

	public static void m4() {
		
		System.out.println(number);
		System.out.println(name);
		
	}
	
	public  void m5() {
		number1=500;
		System.out.println(number1);
		
	}

}
