package week1.day2;

public class Mobile {
	String isDamaged="Return the mobile to the store";
	public void realme() {
		String mobileBrandName="Realme 3pro";
		System.out.println("Mobile brand name	: "+mobileBrandName);
		
		char mobileLogo='R';
		System.out.println("Mobile Logo		: "+mobileLogo);
		
		short noOfMobilePiece= 3;
		System.out.println("no of mobile piece	: "+noOfMobilePiece);
		
		int modelNumber=1851;
		System.out.println("Model Number		: "+modelNumber);
		
		long mobileImeiNumber=638497544880121l;
		System.out.println("Imei number		: "+mobileImeiNumber);
		
		float mobilePrice=20.8f;
		System.out.println("Mobile price in doller	: "+mobilePrice);
		
		boolean isDamaged=true;
		System.out.println("Mobile is damaged	: "+isDamaged);
	}
	public static void main(String[] args) {
		Mobile realme=new Mobile();
		realme.realme();
	}

}
