package array;

public class ArrayLargestnumber {
	
	public static void main(String[] args) {
		
		int max[]= {22,18,57,45,89,92};
		int largest= max[0];
		
		
		for(int i=0;i<max.length;i++) {
			
			if(max[i]>largest) {//22>22false
				//18>22
				//57>22
				
				largest=max[i];//45>57
				//89>57
				//92>89
				
			}	
		
		
	}
		System.out.println("Largest number---->" +largest);
}}
