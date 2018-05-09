package deneme;

import java.util.Scanner;

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.println("Putting new Car to the road....");
	
		System.out.println("Choose your car model:");
		String carModel = input.next();
		
		System.out.println("Choose your car color:");
		String carColor= input.next();
		
		System.out.println("Choose your car current speed");
		int carSpeed=input.nextInt();
		
		Car yourcar= new Car();
		
		yourcar.model=carModel;
		yourcar.color=carColor;
		yourcar.currentSpeed=carSpeed;
		
		yourcar.carInformation();
		yourcar.accelerate(40);
		yourcar.carInformation();
		int totalSpeed=yourcar.getCurrentSpeed();
		System.out.println("Speed after acceleration:"+totalSpeed);
		System.out.println(yourcar.getCurrentSpeed());
		

	}

}
