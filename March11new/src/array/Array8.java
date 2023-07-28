package array;

public class Array8 {
public static void main(String[] args) {// number of row 4
	                                     //number of coumn 3
	            //c1 c2 c3  c4
	int S1[][]= {{11,12,13,20},{14,15,16,34},{17,18,19,35},{20,21,22,26},{24,25,26,27}}; //4*3
	                //R1              R2         R3              R4           R5
	System.out.println(S1.length);
	System.out.println(S1[1].length);
	for(int i=0;i<S1.length;i++) {
		for(int j=0;j<S1[2].length;j++) {
			
			System.out.print(S1[i][j]+" ");
			
		}
		System.out.println();
		
	}
	
}
}
