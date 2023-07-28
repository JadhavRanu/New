package Wrapperclass;

public class Test3 {

	public static void main(String[] args) {
		String S1 ="200.45";
		String S2 ="400.00";
		System.out.println(S1+S2);
		
		double value1=Double.parseDouble(S1);
		double value2=Double.parseDouble(S2);
		double addition= value1+value2;
		System.out.println(addition);
		if(addition==600.45) {
			System.out.println("Correct Addition");
		}
		else {
			System.out.println("Incorrect Addition");
		}
	}

}
