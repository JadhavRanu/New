package Constructor;

public class Default_constructor {

	//Default constructor
	
	public Default_constructor() {
	
	super();// keyword or class
	
	}
	//Rule
	//1. It always no argument or zero parameter
	//2. Provide the access modifiers of the default constructor should be same as class modifier.
	//3.Default constructor contain only one line code that is super()
	//4. The default constructor is used to provide the default value to the object
	// ex. null, 0,false
	
	
	
	public static void main(String[] args) {
		
		Default_constructor sm =new Default_constructor();
		Default_constructor sm1 =new Default_constructor();
		
		sm.m1();
		sm1.Addition();	
		
	}

	
	public void m1() {
		
		System.out.println("Default costructor");
		
	}
	
	public void Addition() {
		
		int a =20;
		int b =30;
		int Sum =a+b;
		
				
		System.out.println(Sum);
		
		
	}
	
	
	
	
	
	
}
