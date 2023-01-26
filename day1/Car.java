package week1.day1;

public class Car {
	public void startEngine() {
		System.out.println("Start the Car");
		
	}
	public void switchOnAc() {
		System.out.println("I'm sweating turn on the AC plese");
		
	}
	public void applyGear() {
		System.out.println("Put 1st gear and move the car slowly");
		
	}
	public void applyAcclerate() {
		System.out.println("Press Acclerator to increase the speed and change 2nd gear");
		
	}
	public void applyBreak() {
		System.out.println("Press the break gently");
		
	}
	public static void main(String[] args) {
		Car kia=new Car();
		kia.startEngine();
		kia.switchOnAc();
		kia.applyGear();
		kia.applyAcclerate();
		kia.applyBreak();
	}

}
