package oops;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati= new MotorBike();
		MotorBike honda= new MotorBike();
		ducati.start();
		ducati.price();
		honda.wheelie();
		honda.stop();
		// Here we are using the setter to set the value of a class member i.e. a private member of a class using functions/methods.
		ducati.setSpeed(50);
		honda.setMileage(80);
		// Here we are using the getter to get the value of a class member i.e a private member of a class using function/ methods.
		System.out.println("The speed of the ducati bike is "+ ducati.getSpeed());
		System.out.println("The mileage of the honda bike is "+ honda.getMileage());
		
	}
}
