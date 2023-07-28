package inheritance;

public class Hierachical_Test {

	public static void main(String[] args) {
		
		Father_Hierachical F1= new Father_Hierachical();
		F1.car();
		F1.Home();
		F1.money();
		System.out.println();
		Son1 S1 = new Son1();
		S1.Bike();
		S1.car();
		S1.Home();
		S1.money();
		
		System.out.println();
		Son2 S2 = new Son2();
		S2.car();
		S2.Laptop();
		S2.money();
		S2.Home();
		System.out.println();
		Son3 S3 = new Son3();
		S3.Mobile();
		S3.car();
		S3.Home();
		S3.Mobile();
		
		
		
	}
	
	
	
}
