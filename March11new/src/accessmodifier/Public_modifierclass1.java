package accessmodifier;

public class Public_modifierclass1 {

	
	public static void main(String[] args) {
		
		Public_modifierclass1 A1= new Public_modifierclass1();
		
		A1.Addition(10, 20);
		
		Public_modifierclass1 s1 =new Public_modifierclass1();
		s1.substraction();
		
		Public_modifierclass1 m1 =new Public_modifierclass1();
		m1.multi();
		Public_modifierclass1 d1 =new Public_modifierclass1();
		d1.division();
		
	}
	
	public void Addition(int i,int j) {// access level everywhere
		
		int sum =i+j;
		System.out.println(sum);
	
		
	
		
	}
	
	private void substraction() { // Access level within the class only
	int i= 20;
	int j= 10;
	int sub = i-j;
	System.out.println(sub);
	
	}
	protected void multi() {  // Access level within the package and access level out side the package with the help of extends keyword
		int i= 20;
		int j= 10;
		int multiple = i*j;
		System.out.println(multiple);
	
	}
		void division() {  // access level within the package. when we dose not specify the access level it will be the default.
			
			int i= 500;
			int j= 10;
			int divide = i/j;
			System.out.println(divide);	
			
		}
			
			
			

		
	}




