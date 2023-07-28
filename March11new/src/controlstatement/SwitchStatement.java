package controlstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		int num =200;
		switch (num) {
		
		case 20:
			System.out.println("Number matched-20");
			break;
		case 40:
			System.out.println("Number matched-40");
		case 60:
			System.out.println("Number matched-60");
		case 100:
			System.out.println("Number matched-100");
			
		case 200:
			System.out.println("Number matched-200");
			break;
			default:
				System.out.println("Number is not matched");	
		}
	}

}
