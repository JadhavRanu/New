package interfaces;

public class Test {

	
	public static void main(String[] args) {
		
		HSBCBank HB= new HSBCBank ();  //Static binding/CTP
		HB.HomeLoan();
		HB.GoldLoan();
	    HB.Carloan();
		HB.Creditcard();
		HB.Debitcard();
		HB.Bikeloan();
		HB.MutualFund();
        HB.Personalloan();
        HB.Transfermoney();
        System.out.println(HB.MinAmout);
		System.out.println("**********************");
		
		RBIbank RB=new HSBCBank();
		RB.Creditcard();
		RB.Debitcard();
		RB.Transfermoney();
		System.out.println(RB.MinAmout);
		System.out.println("**********************");
		
		USBank US= new  HSBCBank();
		US.Bikeloan();
		US.Personalloan();
		
		System.out.println("**********************");
		
		BrazilBank B1= new HSBCBank();
		B1.Carloan();
		B1.MutualFund();
		
		
		
	}}
