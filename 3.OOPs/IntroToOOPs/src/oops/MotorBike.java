package oops;

public class MotorBike {
	private int speed;
	private int mileage;
	void start() {
		System.out.println("This function starts the bike.");
	}
	void stop() {
		System.out.println("This function stops the bike.");
	}
	void wheelie() {
		System.out.println("This function asks the rider to perfrom a wheelie.");
	}
	void setMileage(int mileage) {
		this.mileage=mileage;
		System.out.println("This function calculates the mileage of the bike is " );
	}
	
	int getMileage() {
		return this.mileage;
	}
	void price() {
		System.out.println("This function provides the price of the bike.");
	}
	void setSpeed(int speed) {
	  this.speed=speed;
	}
	
	int getSpeed() {
		return this.speed;
	}
}
