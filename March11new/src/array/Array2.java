package array;

public class Array2 {

	
	public static void main(String[] args) {
		
		String S1[]= new String[4];
		//String S1[]= new String[-3];    // No -negative array size exception 
		
		
		S1[0]= "Rahul";
		S1[1]= "1234";
		S1[2]= "@#$%";
		S1[3]= "Ridhvansh";
		
		for (int i=0;i<S1.length;i++) {
			
			System.out.println(S1[i]);
		}
		
		
		
		
	}
}
