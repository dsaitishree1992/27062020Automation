package Oops.Abstraction;

public class SBI implements Rbi{

	@Override
	public void savingAccount() {
		System.out.println("SBI Saving Account");
		
		
	}

	@Override
	public void currentAccount() {
		System.out.println("SBI Current Account");
		
	}

	@Override
	public void debitCard() {
		System.out.println("SBI Debit Card");
		
	}

	@Override
	public void creditCard() {
		System.out.println("SBI Credit Card ");
		
	}

}
