package bank;
public class Deposit implements Transaction {
public void process(int amt) {
	System.out.println("Amount deposited:"+amt);
	Balance.bal=Balance.bal+amt;
	Balance.getBalance();
	System.out.println();
	System.out.println("Transaction completed");
}
}
