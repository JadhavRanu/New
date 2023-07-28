package thisSuperKeyword;

public class Super extends ThisSuper{

	public void demo1() {
		
		System.out.println(super.Name);
		System.out.println(super.Rollnumber);
	}
	
	
	public static void main(String[] args) {
		Super s3= new Super();
		s3.demo1();
	}
}
