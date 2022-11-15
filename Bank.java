class Bank{

	int balance = 1000;

	void debitAmt(int amt){
		balance = balance - amt;
	}

	void creditAmt(int amt){
		balance = balance + amt;
	}

	void printBalance(){
		System.out.println("Available balance is ---- " + balance);
	}

	public static void main(String [] args){
		Bank bank= new Bank();
		bank.debitAmt(50);
		bank.debitAmt(150);
		bank.printBalance();
		bank.creditAmt(1200);
		bank.printBalance();
		bank.creditAmt(200);
		bank.creditAmt(200);
		bank.printBalance();
	}
}