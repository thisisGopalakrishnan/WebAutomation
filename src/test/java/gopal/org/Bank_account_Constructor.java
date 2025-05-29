package gopal.org;

public class Bank_account_Constructor {
int account_number;
String Name;
double balance;

//
Bank_account_Constructor(){
	
	System.out.println("Deaful constrcutor has called when object has created");

this.Name="Gopal";
		
}




public void Bank_account_Constructor(int Acc_number, double inital_balance) {
	this.account_number=Acc_number;
	this.balance=inital_balance;
}
	public void deposite(int acc) {
		System.out.println("User name  "+Name);
	if (acc >0) {	
		this.balance+=acc;
		System.out.println(acc);
		System.out.println(account_number);
		System.out.println("balance amount"+balance);
	}
	
	}
	public void Withdraw(int withdraw_amount) {
		if(withdraw_amount<balance) {
			balance-=withdraw_amount;
				}
		else {
			System.out.println("Please enter lesser amount");
		}
	}
	public double getbalace() {
return balance;

	}
	public static void main(String[] args) {
		Bank_account_Constructor obj = new Bank_account_Constructor();
		obj.Bank_account_Constructor(12345, 1000);
		obj.deposite(1000);
		obj.getbalace();
		obj.Withdraw(200);
		System.out.println("Current balance amount" + "  RS."+obj.getbalace());
	
	}
}
