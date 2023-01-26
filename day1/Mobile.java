package week1.day1;

public class Mobile {
	public void unlockMobile() {
		System.out.println("Use pin to unlock the mobile");
		
	}
	public void openWhatsApp() {
		System.out.println("Open the whatsapp and open the friend chat");
		
	}
	public void sendMessage() {
		System.out.println("Type the text Message and Send");
		
	}
	public void shareDocument() {
		System.out.println("Select the Document and send");
		
	}
	public void call() {
		System.out.println("After sending the files inform the friend via call");
		
	}
	public static void main(String[] args) {
		Mobile realme=new Mobile();
		realme.unlockMobile();
		realme.openWhatsApp();
		realme.sendMessage();
		realme.shareDocument();
		realme.call();
	}

}
