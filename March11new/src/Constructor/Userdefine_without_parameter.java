package Constructor;

public class Userdefine_without_parameter {

	//variable declaration
	
	int i;
	int j;
	int sum;
	int substraction;
	public Userdefine_without_parameter()
	{
	
	i=10;
	j=20;
	sum= i+j;
	substraction= i-j;
	System.out.println(sum);
	System.out.println(substraction);

	}
	public static void main(String[] args) {
		
		Userdefine_without_parameter s = new Userdefine_without_parameter();
		
	}
	
	
}
