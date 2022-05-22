package bank;
import java.util.*;
@SuppressWarnings("serial")
public class BankMainClass extends Exception{
public BankMainClass(String msg) {
	super(msg);
}
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
try(s;){
	try {		
		System.out.println("          SBI");
		System.out.println("Hi,Please do not Remove your Chip Card.\nLeave your card Inserted during Entire Transaction" );
		try {
			  Thread.sleep(10000);
		}
		catch(Exception e) {
			 System.out.println(e);
		}
		System.out.println("           SBI   ");
		System.out.println("Please Select Language");
		System.out.println("         1.ENGLISH");
		 System.out.println("Enter the choice:");
		int lan=s.nextInt();
		switch(lan) {
		case 1:System.out.println("          SBI");
		System.out.println("Enter any number between 10 and 99.Press yes or no");
		System.out.println("        for eg.25");
		 int num=s.nextInt();
		 if(num>=10&&num<=99) {
			 System.out.println("Choose:");
			 System.out.println("1.YES");
			 System.out.println("2.NO");
			 System.out.println("Enter the choice:");
			 int yn=s.nextInt();
			 if(yn==1) {
				 System.out.println("          SBI");
				 System.out.println("     PLEASE ENTER YOUR PIN");
				 int pinNo=s.nextInt();
				 CheckPinNo cpn1=new CheckPinNo();
				 cpn1.verify(pinNo);
				 try {
					  Thread.sleep(1000);
				}
				catch(Exception e) {
					 System.out.println(e);
				}
				 System.out.println("          SBI");
				 System.out.println("Please Choose BANKING for Cash Withdrawl");
				 System.out.println("          1.BANKING");
				 System.out.println("          2.BALANCE ENQUIRY");
				 System.out.println("Enter the choice:");
				 int bn=s.nextInt();
				 switch(bn) {
				 case 1:
					 try {
						  Thread.sleep(1000);
					}
					catch(Exception e) {
						 System.out.println(e);
					}
					 System.out.println("     1.WITHDRAWL");
					 System.out.println("     2.BALANCE ENQUIRY");
					 System.out.println("     3.Deposit");
					 System.out.println("Enter the choice:");
					 int wb=s.nextInt();
					 switch(wb) {
					 case 1:System.out.println("Enter the amount:");
					 int a1=s.nextInt();
						if(!(a1>0 && a1%100==0)) {
							BankMainClass ob2=new BankMainClass("Invalid amount..\nPlease enter the amount in the multiples of 100 ");
							throw ob2;
						}
						WithDraw wd =new WithDraw();
						wd.process(a1);
						break;
					 case 2:
						 try {
							  Thread.sleep(1000);
						}
						catch(Exception e) {
							 System.out.println(e);
						}
						 Balance.getBalance();
						 try {
							  Thread.sleep(1000);
						}
						catch(Exception e) {
							 System.out.println(e);
						}
						 System.exit(0);
						 break;
					 case 3:System.out.println("Enter the amount:");
						int a2=s.nextInt();
						if(!(a2>0 && a2%100==0)) {
							BankMainClass ob3=new BankMainClass("Invalid amount..\\nPlease enter the amount in the multiples of 100");
							throw ob3;
						}
						Deposit dp=new Deposit();
						dp.process(a2);
						break;
					 default:
							BankMainClass ob1=new BankMainClass("Invalid choice...");
							throw ob1;
					 }
					 
				break;
				 case 2:
					 try {
						  Thread.sleep(1000);
					}
					catch(Exception e) {
						 System.out.println(e);
					}
					 Balance.getBalance();
					 try {
						  Thread.sleep(1000);
					}
					catch(Exception e) {
						 System.out.println(e);
					}
					 System.exit(0);
				 break;
				default:
					System.out.println("Invalid choice");
					System.exit(0);
				 }
			 }
			 else {
				 System.out.println("Transaction ended");
				 System.exit(0);
			 }
		 }
		 else {
			 System.out.println("Invalid number");
			 System.exit(0);
		 }
		 break;
		default:System.out.println("Invalid Language..");
	}
	
}
catch(CheckPinNo|BankMainClass|WithDraw ob) {
	System.out.println(ob.getMessage());
}
}

}}