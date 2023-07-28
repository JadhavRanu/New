package abtraction;

public abstract class Parent_Abstractclass {

	
	
	public abstract void Method1();//Abstract method /incomplete method
	
	public abstract void Method2();
	
	public void HDFCBank() {       //non abstract method/complete method
		
		System.out.println("Loan");
		
	}
	
	public void KotakBank() {
		
		System.out.println("Credit card");
		
		}
	public void Unionbank() {
		
		System.out.println("Debit card");
	}
	
}
