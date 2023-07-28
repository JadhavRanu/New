package Constructor;

public class Userdefinewithparameter1 {
	
	String Carname;
	String Model;
	int price;
	String Engine;
	
	public  Userdefinewithparameter1(String Carname,String Model,int price,String Engine) {
		
		this.Carname= Carname;
		this.Model= Model;
		this. price= price;
		this.Engine= Engine;
		
	}
	
	public static void main(String[] args) {
		
	
		
		
		Userdefinewithparameter1 C1=new Userdefinewithparameter1 ("Tata","Nexon",1200000,"Automatic" );
		Userdefinewithparameter1 C2=new Userdefinewithparameter1 ("Honda","city",2000000,"Automatic" );
		Userdefinewithparameter1 C3=new Userdefinewithparameter1 ("Hundai","Verna",1200000,"Manual" );
		Userdefinewithparameter1 C4=new Userdefinewithparameter1 ("KIA","Selton",1500000,"Manual" );
		
		
		System.out.println(C1.Carname+"   "+C1.Model+"  " +C1.price +"  " + C1.Engine);
		
		System.out.println(C2.Carname+"   "+C2.Model+"  " +C2.price +"  " + C2.Engine);
		
		System.out.println(C3.Carname+"   "+C3.Model+"  " +C3.price +"  " + C3.Engine);
		
		System.out.println(C4.Carname+"   "+C4.Model+"  " +C4.price +"  " + C4.Engine);
		
	}
		
	}
	


