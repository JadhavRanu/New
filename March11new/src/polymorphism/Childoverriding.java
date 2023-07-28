package polymorphism;

public class Childoverriding extends Fatrher_overriding{

	
	public void bike() {
		
		System.out.println("Honda");
		
	}
public void car() {
		
		System.out.println("Car......Verana");	
	}
	
	public static void main(String[] args) {
		
		Fatrher_overriding F1 = new Fatrher_overriding(); //Static poly+comile time
		
		
		F1.car();
		F1.Home();
		F1.money();
		
		Childoverriding C1=new Childoverriding ();
		C1.bike();
		C1.car();
		C1.Home();
		C1.money();
		
		Fatrher_overriding F2 = new Childoverriding(); // Dynamic poly+Run time+ top casting
		
		F2.car();
		F2.Home();
		F2.money();
		
		//Childoverriding C2 =new Fatrher_overriding(); // Down casting
		//ClassCastExpectation
	}
	
	
	
}


