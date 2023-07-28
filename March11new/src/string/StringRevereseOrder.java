package string;

public class StringRevereseOrder {
	public static void main(String[] args) {
		String S1= "Welcome to Java And Automation";
		//EXp result emoclew ot avaj dna noitamotua
		//Exp result- automation and java to welcom
		
		String Rev="";
		System.out.println(S1.length());
		
			for (int j=S1.length()-1;j>=0;j--) {
		Rev = Rev+S1.charAt(j);
				
			}
			System.out.println(Rev);
			
			
			/*String[]words= S1.split("");
			String result="";
			for(int i=words.length-1;i>=0;i++) {
				if(i==0) {
					System.out.println(result);}
					else {
						System.out.println(Rev);
					}*/
				
			
}}
	
	
	


