package Wrapperclass;

public class Test2 {

	public static void main(String[] args) {
		String S1 ="200";
		String S2 ="400";
		System.out.println(S1+S2);
		
		int value1=Integer.parseInt(S1);
		int value2 =Integer.parseInt(S2);
		int addition= value1+value2;
		System.out.println(addition);
		if(addition==600) {
			System.out.println("Correct Addition");
		}
		else {
			System.out.println("Incorrect Addition");
		}
	}

}
