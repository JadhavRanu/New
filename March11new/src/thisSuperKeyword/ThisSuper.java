package thisSuperKeyword;
public class ThisSuper{
	int Rollnumber= 20;
	String Name ="Rahul";
	
	public void M1() {
		int Rollnumber = 30;
		String Name = "Rajat";
		System.out.println(this.Name);
		System.out.println(Name);
		System.out.println(this.Rollnumber);
		System.out.println(Rollnumber);

	}
	public static void main(String[] args) {
		ThisSuper T1=new ThisSuper();
		T1.M1();
		
	}
		 
	
}
