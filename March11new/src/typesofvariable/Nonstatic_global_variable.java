package typesofvariable;

public class Nonstatic_global_variable {

	int Rollnumber=25;
	String Name= "Rahul";
	
	public static void main(String[] args) {
		
		Nonstatic_global_variable Ngv = new Nonstatic_global_variable();
		Ngv.m1();
		
		Nonstaticvariable Dng= new Nonstaticvariable();

		System.out.println(Nonstaticvariable.Rollnumber);
		System.out.println(Nonstaticvariable.Name);
		System.out.println(Dng.grade);
		System.out.println(Dng.number);
	}
	
	public void m1() {
		
		System.out.println(Rollnumber);
		System.out.println(Name);
		
	}
	
	
}
