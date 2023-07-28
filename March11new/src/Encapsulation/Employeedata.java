package Encapsulation;

public class Employeedata {
	
	private int IDnumber;
	private String EmpName;
	private int EmpAge;

	public static void main(String[] args) {
		
	Employeedata ED = new Employeedata ();
	
	ED.setIDnumber(1234);
	ED.setEmpName("Rahul");	
    ED.setEmpAge(25);
    System.out.println("Emplyee name is:"+ED.getEmpName());
    System.out.println("Emplyee age is is:"+ED.getEmpAge());
    System.out.println("Emplyee ID is:"+ED.getIDnumber());
		
		

	}
	public int getIDnumber() {
		return IDnumber;}
	
	public void  setIDnumber(int IDnumber) {
		this.IDnumber= IDnumber;
	}
	public String getEmpName() {
		return EmpName;
		
	}
	public void setEmpName(String Empname) {
		this.EmpName= Empname;
		
	}
	public int getEmpAge() {
		return EmpAge;}
	public void setEmpAge(int EmpAge) {
		this.EmpAge = EmpAge;
	}
	
}

