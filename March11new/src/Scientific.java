
public class Scientific implements calculator,Casio  {

	@Override
	public void tan() {
		System.out.println("tan function");
	}

	@Override
	public void cot() {
		System.out.println("cosin function");
		
	}

	@Override
	public void Addition() {
		System.out.println("Addition function");
	}

	@Override
	public void substraction() {
		System.out.println("Substraction function");
		
	}

	@Override
	public void multipication() {
		System.out.println("multiplication function");
		
	}
	public void Sin() {
		
		System.out.println("multiplication function");	
	}
	
	
public static void main(String[] args) {
	
	Scientific S1= new Scientific(); //Static binding+ Compile time
	S1.Addition();
	S1.substraction();
	S1.cot();
	S1.multipication();
	S1.tan();
	S1.Sin();
	System.out.println("*********************");
	
	calculator C1= new Scientific(); //Dynamic binding + Runtime
	C1.Addition();
	C1.substraction();
	C1.multipication();
	System.out.println("*********************");
	Casio C2= new Scientific();//Dynamic binding + Runtime
	C2.Addition();
	C2.tan();
	C2.cot();
	
	
	
	
}
	
	
}