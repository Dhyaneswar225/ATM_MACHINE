package bank;
@SuppressWarnings("serial")
public class CheckPinNo extends Exception {
	public CheckPinNo() {
		
	}
public CheckPinNo(String msg) {
	super(msg);
	}
public void verify(int pinNo)throws CheckPinNo{
	try {
		if(!(pinNo==1234)){
			CheckPinNo cpn2=new CheckPinNo("Invalid Pin no");
		throw cpn2;}
	}
	catch(CheckPinNo cpn2) {
		throw cpn2;
	}
}
}
