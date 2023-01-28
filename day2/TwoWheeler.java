package week1.day2;

public class TwoWheeler {
	public void bikeInfo() {
		String bikeName="BMW s1000RR";
		System.out.println("Bike name	:"+bikeName);
		
		double runningKm=2382.22;
		System.out.println("Running KM	:"+runningKm);
		
		int noOfWheels=2;
		System.out.println("No of wheels	:"+noOfWheels);
		
		short noOfMirror=2;
		System.out.println("No of mirrors	:"+noOfMirror);
		
		long chassisNumber=63849756638l;
		System.out.println("Chassis number	:"+chassisNumber);
		
		boolean isPunchered=false;
		System.out.println("Tyre is puncherd:"+isPunchered);
		
	}
	public static void main(String[] args) {
		TwoWheeler v=new TwoWheeler();
		v.bikeInfo();
	}

}
