package assignment.oops;

public class Automation extends MultipleLangauge{

	public void Selenium() {
		System.out.println("Automation");
	}

	public void java() {
		System.out.println("Cofee with Programming");
	}

	@Override
	public void ruby() {
		System.out.println("Shining Language");
	}
	
	public static void main(String[] args) {
		Automation code=new Automation();
		code.Selenium();
		code.java();
		code.ruby();
		code.python();
	}
	
}
