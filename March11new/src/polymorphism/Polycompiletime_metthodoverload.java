package polymorphism;

public class Polycompiletime_metthodoverload {

	public static void main(String[] args) {
		
		Polycompiletime_metthodoverload P =new Polycompiletime_metthodoverload();
		
		P.Overload();
		P.Overload(10);
		P.Overload(10, 20);
		
		
		Polycompiletime_metthodoverload.Overload1();
		Polycompiletime_metthodoverload.Overload1(20);
		Polycompiletime_metthodoverload.Overload1(30,40);
		
		
		
	}
	
		
	


public  void Overload() {// zero input parameter
	
	System.out.println("Hello");
	
}

public  void Overload(int i) { // one input parameter with same method name
	
	
	System.out.println(i);
	
	
}

public  void Overload(int a,int b) { // two input parameter or argument
	
	
	
	int sum =a+b;
	System.out.println(sum);
	
	
	
}

public static void Overload1() {// zero input parameter
	
	System.out.println("Hello");
	
}

public static void Overload1(int i) { // one input parameter with same method name
	
	
	System.out.println(i);
	
	
}

public static void Overload1(int a,int b) { // two input parameter or argument
	
	
	
	int sum =a+b;
	System.out.println(sum);
	






}




}