package inter;

public class Childclass extends Constructor {

	@Override
	public void method1() {
		System.out.println("incomplete method");
		
	}

	@Override
	public void method2() {
		System.out.println("concrete class");
		
	}
	public void method3() {
		System.out.println("Method3");
		
	}
public static void main(String[] args) {
	Childclass C1= new Childclass();
	C1.method1();
	C1.method2();
	C1.demo1();
	C1.demo2();
	C1.method3();
	System.out.println("**************************");
	Constructor C2 = new Childclass();
	C2.demo1();
	C2.demo2();
	C2.method1();
	C2.method2();
	
	
	
}
	
	
	
	
	
	
	
	
	
	
}
	

