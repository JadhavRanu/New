package string;

public class LiteralString {

	public static void main(String[] args) {
		
		//1.By using string literal
		//syntax: String String variable name= "values";
		
		String str= "Automation";   //SCP- Stored in String constant pool
		String str1="Automation";   //SCP
		
		
		//2.By using new keyword
		//syntax: String SVN= new String("value");
		String S1= new String("Java");//Heap and SCP
		String S2= new String("Java"); //Heap take reference of S1 in SCP
		String S3= new String("Automation");//Heap and SCP
		
		System.out.println(S1==(S2));//true
		System.out.println(str==S3);
		
		
	}

	
}
