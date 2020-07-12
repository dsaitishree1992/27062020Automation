package Oops.Abstraction;

public class BankUser {

	public static void main(String[] args) {
		
		
		account(new SBI()); //SBI ==Chrome
		account(new HDFC()); //HDFC ==Firefox
		account(new ICICI()); //ICICI ==Edge
	
		
		  String name ="anand"; Rbi bank=new ICICI(); int a=10;
		  
		  sum(a); message(name); account(bank);
		  
		  sum(20); message("Prachee"); account(new SBI());
		 
	 		
	 }
	 public static void account(Rbi bank) //RBI ==Webdriver
	 {
		 bank.creditCard();//Navigate
		 bank.debitCard();//click
		 bank.savingAccount(); //Enter date
		 bank.currentAccount(); //Select Option
		
	}
	 
	
	  public static void sum(int a) {
	  
	  } public static void message(String name) { System.out.println("your name is"
	  + name); }
	 

}
