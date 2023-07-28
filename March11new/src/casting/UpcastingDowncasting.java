package casting;

public class UpcastingDowncasting extends NonprimitiveCasting {
	
	public void Demo3() {
		System.out.println("Demo3-Method");
		
	}

	public static void main(String[] args) {
		UpcastingDowncasting C1= new UpcastingDowncasting();
		C1.Demo1();
		C1.Demo2();
		C1.Demo3();
		System.out.println();
		NonprimitiveCasting C2= new UpcastingDowncasting();
		C2.Demo1();
		C2.Demo2();
		System.out.println();
		UpcastingDowncasting C3= (UpcastingDowncasting) new NonprimitiveCasting();
        C3.Demo1();
        C3.Demo2();
        C3.Demo3();
	}

}
