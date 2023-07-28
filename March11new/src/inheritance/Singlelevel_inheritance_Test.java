package inheritance;

public class Singlelevel_inheritance_Test {
 public static void main(String[] args) {
	
	 Son_singlelevel c1 = new Son_singlelevel();
	 c1.Bike();
	 c1.Home();
	 c1.money();
	 c1.car();
	 
	 
	System.out.println();
	
	Father_singlelevel F = new Father_singlelevel();
	 F.Home();
	 F.money();
	 F.car();
	
}
	
}
