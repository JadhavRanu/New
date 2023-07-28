package abtraction;

public class Childclass_Abtraction extends Parent_Abstractclass{

	@Override
	public void Method1() {
	System.out.println("Overriding method");	
	}

	@Override
	public void Method2() {
		System.out.println("Abstraction method");		
		
	}
     public void Method3() {
    	 System.out.println("Method calling");
     }
	
	public static void main(String[] args) {
	
		Childclass_Abtraction C1= new Childclass_Abtraction();
		C1.HDFCBank();
		C1.KotakBank();
		C1.Method1();
		C1.Method2();
		C1.Unionbank();
		C1.Method3();
		System.out.println("********************************");
		Parent_Abstractclass P1= new Childclass_Abtraction();//overriding/Dynamic 
		P1.Method1();
		P1.Method2();
		P1.HDFCBank();
		P1.KotakBank();
		P1.Unionbank();
		
		
	}
	
}
