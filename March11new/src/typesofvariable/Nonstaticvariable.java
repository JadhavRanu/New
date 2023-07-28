package typesofvariable;

public class Nonstaticvariable {
	static int Rollnumber=45;
	static String Name= "Nishant";
	char grade='A';
	
	int number= 12;

public void m2() {
	
	System.out.println(Rollnumber);
	System.out.println(Name);
}

public static void main(String[] args) {
	
	System.out.println(Nonstaticvariable.Rollnumber );
	System.out.println(Nonstaticvariable.Name);
	Nonstaticvariable t = new Nonstaticvariable ();
	t.m2();
}


}