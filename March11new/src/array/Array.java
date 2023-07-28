package array;

public class Array {
public static void main(String[] args) {
	// Array is a collection of similar type of element/values.
	//We can store only fixed set element in java array
	// array is index based and first element of the array is stored at 0 index and last index n-1(arrayname)
	
	
	
	
//1. Array Declaration
	//Syntax
	//data type arrayname[] = new data type [size of array]
	int C1[]= new int[10];
	
	
	//2. Array initilization
	//Syntax- arrayname[indexnumber]
	
	C1[0]= 10;
	C1[1]= 20;
	C1[2]= 30 ;
	C1[3]= 40;
	C1[4]= 50;
	C1[5]= 60;
	C1[6]= 70;
	C1[7]= 80;
	C1[8]= 90;
	C1[9]= 100;
	
	//C1[11]=30;//Array Index out ofBoundsException
	
	//3. Array usage
	System.out.println("Length of index" +C1.length);
	System.out.println("Index5:"+" "+C1[5]);
	
	System.out.println("**********************");
	for(int i=0;i<C1.length;i++)
	{
		System.out.print(C1[i]+" ");
	}
	
}
}
