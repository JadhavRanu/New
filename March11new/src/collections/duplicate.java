package collections;

public class duplicate {

	public static void main(String[] args) {
		int Number[]= {12,20,22,24,23,13,12,20};
		System.out.println(Number.length);
		System.out.println("*************");
		for(int i=0;i<Number.length;i++) {
			for(int j=i+1;j<Number.length;j++) {
				if(Number[i]==Number[j]) {
					System.out.println(Number[j]);
				}
				
			}
		}

	}

}
