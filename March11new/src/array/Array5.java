package array;

public class Array5 {
public static void main(String[] args) {
	

	Object obj[]= new Object[4];  //non similar /Heterogeneous
	obj[0]= 10.20f;
	obj[1]= 'A';
	obj[2]= "Rohan";
	obj[3]= true;
	
	for(int a=0;a<obj.length;a++) {
		System.out.println(obj[a]);
	}
}
}
