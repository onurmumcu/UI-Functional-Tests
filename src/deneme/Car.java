package deneme;

public class Car {
	String model;
	int currentSpeed;
	String color;
	
	public void carInformation() {
		System.out.println(color + " "+model+" is driving " +currentSpeed+" mph" );
	}
	
	public void accelerate(int moreSpeed) {
		currentSpeed=currentSpeed+moreSpeed;
		System.out.println("accelerating....");
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
}
