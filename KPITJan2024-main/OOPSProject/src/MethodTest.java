
public class MethodTest {
	public static void main(String[] args) {
		
		BankAccount1 bankAccObjRef1 = new BankAccount1();
		bankAccObjRef1.withdraw();
		bankAccObjRef1.withdraw(5000.0f);
		double remBalance = bankAccObjRef1.withdraw(4000.0);
		System.out.println("Rem Bal : "+remBalance);
	
		bankAccObjRef1.withdraw(28000.0f);
		double myBal = bankAccObjRef1.whatIsMyBalance();
		System.out.println("My Bal : "+myBal);
		
	}
}

class BankAccount1 {
	double currentBalance=50000;
	//1. function without argument and without return value
	void withdraw() {
		System.out.println("1. withdrawing...");
	}
	//2. function with argument and without return value
	void withdraw(float amountToWithdraw) {
		System.out.println("2. withdrawing..."+amountToWithdraw);
		currentBalance = currentBalance - amountToWithdraw;
	}
	//3. function with argument and with return value
	double withdraw(double amountToWithdraw) {
		System.out.println("2. withdrawing..."+amountToWithdraw);
		currentBalance = currentBalance - amountToWithdraw;
		return currentBalance;
	}
	//4 . function without argumentbut with return value
	double whatIsMyBalance() {
		System.out.println("Finding your balance...");
		return currentBalance;
	}
	
}
