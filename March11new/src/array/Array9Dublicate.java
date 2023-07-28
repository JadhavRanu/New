package array;

public class Array9Dublicate {
 public static void main(String[] args) {
	int D1[]= {20,40,60,80,9,20,40};
	System.out.println(D1.length);
	System.out.println("************");
	
	
	
	for(int i=0;i<D1.length;i++) {
		for(int j=i+1;j<D1.length;j++) {
			if(D1[i]==D1[j]) {
				System.out.println(D1[j]);
			}
		}
	}
}
}
