package abtraction;

public abstract class Abstractconstructor {

	public Abstractconstructor() {
	this(100,200);
		System.out.println("Abstact constructor");
	}
	public Abstractconstructor(int i) {
		
		System.out.println("abstract constructor one input parameter");
		
	}
	public Abstractconstructor (int a,int b) {
		System.out.println("abstract constructor two input parameter");
	}
	
}
