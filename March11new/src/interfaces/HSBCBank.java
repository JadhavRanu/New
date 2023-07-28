package interfaces;

public class HSBCBank implements RBIbank,USBank,BrazilBank{

	
	public void HomeLoan() {
		
		System.out.println("Home loan");
	}
	
	
	public void GoldLoan() {
		System.out.println("Gold Loan");
	}


	@Override
	public void Carloan() {
		System.out.println("Car Loan");
		
	}


	@Override
	public void MutualFund() {
		System.out.println("Mutual Fund Loan");
		
	}


	@Override
	public void Bikeloan() {
		System.out.println("Bike Loan");
		
	}


	@Override
	public void Personalloan() {
		System.out.println("Personal Loan");
	}


	@Override
	public void Creditcard() {
		System.out.println("Credit card ");
		
	}


	@Override
	public void Debitcard() {
		System.out.println("Debit Card");
		
	}


	@Override
	public void Transfermoney() {
		System.out.println("Transfer Money");
		
	}

}
	
