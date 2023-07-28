package inheritance;

public class Multilevel_Test {

	public static void main(String[] args) {
		
		Multilevel_Class3 A = new Multilevel_Class3();
		
		A.Whatsupv1();
		A.Whatsappv2();
		A.Whatsappv3();
		
		
		System.out.println();
	
		Multilevel_Class2 T = new Multilevel_Class2();
		
		T.Whatsupv1();
		T.Whatsappv2();
	
		System.out.println();
		
		Multilevel_class1 V = new Multilevel_class1();
		
		V.Whatsupv1();
		
		
	}
	
	
	
}
