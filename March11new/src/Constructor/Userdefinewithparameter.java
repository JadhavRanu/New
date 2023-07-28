package Constructor;

public class Userdefinewithparameter {

	String Name;
	int Rollnumber;
	char Grade;
	int percentage;
	
	public Userdefinewithparameter(String name, int number1,char grade,  int pec1) {
		
		
		Name = name;
		Rollnumber= number1;
		Grade= grade;
		percentage= pec1;
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Userdefinewithparameter N1 =new Userdefinewithparameter(" Rohit Sharma" , 12 , 'A' ,80  );
		Userdefinewithparameter N2 =new Userdefinewithparameter(" Rahul Mane" , 13 , 'B' ,65  );
		Userdefinewithparameter N3 =new Userdefinewithparameter(" Rani More" , 9, 'A' ,85  );
		Userdefinewithparameter N4 =new Userdefinewithparameter(" Palak Patil" , 20 , 'A' ,80  );
		Userdefinewithparameter N5 =new Userdefinewithparameter(" Kirti" , 14 , 'B' ,60  );
		Userdefinewithparameter N6 =new Userdefinewithparameter(" Rohit Patil" , 22 , 'A' ,81 );
		Userdefinewithparameter N7 =new Userdefinewithparameter(" Aditi Gore" , 23 , 'A' ,75 );
	
		
		
		System.out.println(N1.Name+" "+ N1.Rollnumber +" "+ N1.Grade+" "+ N1.percentage);
		System.out.println(N2.Name+" "+ N2.Rollnumber +" "+ N2.Grade+" "+ N2.percentage);
		System.out.println(N3.Name+" "+ N3.Rollnumber +" "+ N3.Grade+" "+ N3.percentage);
		System.out.println(N4.Name+" "+ N4.Rollnumber +" "+ N4.Grade+" "+ N4.percentage);
		System.out.println(N5.Name+" "+ N5.Rollnumber +" "+ N5.Grade+" "+ N5.percentage);
		System.out.println(N6.Name+" "+ N6.Rollnumber +" "+ N6.Grade+" "+ N6.percentage);
		System.out.println(N7.Name+" "+ N7.Rollnumber +" "+ N7.Grade+" "+ N7.percentage);
		
		
		
		
		
	}
	
	
}
