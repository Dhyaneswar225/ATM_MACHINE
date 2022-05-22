package bank;
@SuppressWarnings("serial")
public class WithDraw extends Exception implements Transaction{
public WithDraw() {
}
public WithDraw(String msg) {
	super(msg);
}
public void process(int amt)throws WithDraw{
	try {
		if(amt>Balance.bal) {
			WithDraw wd=new WithDraw("Insufficient fund..");
		throw wd;
		}
		System.out.println("Amount with drawn:");
			Balance.bal=Balance.bal-amt;
		Balance.getBalance();
		System.out.println();
		System.out.println("Transaction completed");
	
	}
	catch(WithDraw wd) {
		throw wd;
	}
}
}
