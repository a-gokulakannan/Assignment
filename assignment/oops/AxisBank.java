package assignment.oops;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Cash Deposited");
	}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.deposit();
	}
}
