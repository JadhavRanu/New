package array;

public class Array1 {
	
	public static void main(String[] args) {
		
		char arr[] = new char[5];
		
		arr[0]= 'A';
		arr[1]= '1';  //automatic promotion char to integer
		arr[2]= '2';
		arr[3]= 'c';
		arr[4]= 'D';
		
		
		System.out.println(arr.length);
		System.out.println(arr[1]);
		
		for(int j=0; j<arr.length;j++) {
		
		System.out.println(arr[j]);
		
	}}

}
