package array;

public class ArrayAddition {

	public static void main(String[] args) {
		
		int A1[]= {25,35,45,55,65,25};
		
      System.out.println(A1.length);
      
      int sum=0;
      
      for(int i=0;i<A1.length;i++) {
    	  
    	  sum=sum+A1[i];
      }
      System.out.println("Addition of all numbers---->"+ sum);
	
	}
}
