package string;

public class StringMethods {

	public static void main(String[] args) {
		
		//1.length()
		
		String S1= "Automation";
		System.out.println("Length-->"+S1.length());
		
		//2..equals()
		String S2= "Automation";
		String S3= new String("Automation");
		
		System.out.println(S1.equals(S3));
		System.out.println(S2.equals(S3));
		
		//3.charAt()
		
		String S4 = "Object oriented";
		System.out.println(S4.charAt(5));
		System.out.println(S4.charAt(10));
		
		// 4. isEmpty()
		String S5= new String("Java");
		String S6= new String(" "); //white space is also consider as an index.
		String S7= new String("");
		System.out.println(S5.isEmpty());
		System.out.println(S6.isEmpty());
		System.out.println(S7.isEmpty());
		
		//5.replace('old value','new value')
		
		String S8="Software Testing";
		System.out.println(S8.replace('t', 'P'));
		
		//6.replaceAll("word","word")
		String S9="Software Testing";
		
		System.out.println(S9.replaceAll("Software", "Automation"));
		
		//7.substring(Starting index,ending index excluding)
		String S10="Software Testing velocity";
		          //012345678910
		
		System.out.println(S10.substring(3));
		System.out.println(S10.substring(9,13));
		
		//8.index of char()
		String S11="Software Testing velocity";
		
		System.out.println(S11.indexOf('t')); // 1st occurrence
		System.out.println(S11.indexOf('t',S11.indexOf('t')+1));
		
		//9.Last index of()
		
		String S12="Manual Testing velocity";
		System.out.println(S12.lastIndexOf('y'));
		
		
		// 10.to Lower Case()
		String S13="MANUAL TESTING VELOCITY";
		System.out.println(S13.toLowerCase());
		
		//11.toUpperCase
		
		String S14="software testing velocity";
		System.out.println(S14.toUpperCase());
		
		//12.trim()
		
		String S15="     I am Software Tester     ";
		System.out.println(S15.trim());
		
		//13.split()
		
		String S16="Hello-world";
		String S17[]= S16.split("-");
		for(int i=0;i<S17.length;i++) {
			System.out.println(S17[i]);
			
		}
		String Date="4-5-2023";
		String Date1[]= Date.split("-");
		for(int j=0;j<Date1.length;j++) {
			System.out.println(Date1[j]);
		}
		
		// 14. concat- it cone the specified string
		String S ="Hello";
		String T =" World";
		int i= 10;
		int j= 20;
		
		System.out.println(S+T); //30
		System.out.println(S+T+i+j);//Hello Word1020
		System.out.println(i+j+S+T);//30Hello World
		System.out.println(S+T+(i+j));//Hello World30
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
