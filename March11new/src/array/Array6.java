package array;

public class Array6 {
	
public static void main(String[] args) {
	
	//String Row[]= new String[4];
	//String column[]= new String[5];
	
	String RC[][] = new String[4][5];//multidimensional array
	
	//initililation
	// Row and column
	//First Row
	
	RC[0][0]= "A1";
	RC[0][1]= "A2";
	RC[0][2]= "A3";
	RC[0][3]= "A4";
	RC[0][4]= "A5";
	
	//Second Row
	
	RC[1][0]= "B1";
	RC[1][1]= "B2";
	RC[1][2]= "B3";
	RC[1][3]= "B4";
	RC[1][4]= "B5";
	
	// Third row
	
	RC[2][0]= "C1";
	RC[2][1]= "C2";
	RC[2][2]= "C3";
	RC[2][3]= "C4";
	RC[2][4]= "C5";
	
	
	//Forth Row
	
	RC[3][0]= "D1";
	RC[3][1]= "D2";
	RC[3][2]= "D3";
	RC[3][3]= "D4";
	RC[3][4]= "D5";
	
	System.out.println(RC.length);
	System.out.println(RC[2].length);
	System.out.println(RC[3][2]);
	
	
	System.out.println("**********************");
	
	for(int Row=0;Row<RC.length;Row++) {
		
		for(int Col=0;Col<RC[3].length;Col++) {
			
			System.out.print(RC[Row][Col]);
			System.out.print(" ");
			
		}
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
