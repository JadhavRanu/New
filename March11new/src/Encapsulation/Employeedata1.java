package Encapsulation;

public class Employeedata1 {

	public static void main(String[] args) {
		Employeedata ED =new Employeedata();
		ED.setIDnumber(4123);
		ED.setEmpName("Rohit Pawar");	
	    ED.setEmpAge(23);
	    System.out.println("Emplyee name is:"+ED.getEmpName());
	    System.out.println("Emplyee age is is:"+ED.getEmpAge());
	    System.out.println("Emplyee ID is:"+ED.getIDnumber());
}
}