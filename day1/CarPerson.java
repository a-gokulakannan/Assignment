package week1.day1;

public class CarPerson {
	public void driveCar() {
		System.out.println("drift");
	}
	public void stunt() {
		System.out.println("drive like karappan poochi");
	}
	public void flying() {
		System.out.println("Parakkurom");
		
	}
public static void main(String[] args) {
	CarPerson object=new CarPerson();
	object.driveCar();
	object.stunt();
	object.flying();
	
}
}
