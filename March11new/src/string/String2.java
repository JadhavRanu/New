package string;

public class String2 {
public static void main(String[] args) {
	

	String s1= new String("Test");
	String s2= new String("Java");
	String s3= new String("Java");
	String s4 ="Test";
	String s5 ="Test";
	String s6 ="test";
	s1= "Rani";
	
	System.out.println(s1==s4); 
	System.out.println(s4==s5); //
	System.out.println(s4==s6); //
	System.out.println(s2==s3); 
	System.out.println(s2.equals(s6)); 

	System.out.println(s2.equals(s3));
	System.out.println(s1);
	

	// 
}
}
