package polymorphism;

public class Static1_override extends Static_override {

	public static void main(String[] args) {
		
		Static1_override S1 = new Static1_override();
		S1.demo2();
		S1.demo1();
		Static_override S2 = new Static1_override();
		S2.demo2();
		S2.demo1();
		
		
	}
	
	public void demo2() {
		
		System.out.println("print child class");
		
	}
	public static void demo1() {
		System.out.println("Parent class static method");
	}
	
	
	
}
