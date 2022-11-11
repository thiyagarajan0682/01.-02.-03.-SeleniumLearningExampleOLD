package testNG;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority = 0)
	public void StartTheCar() {
		System.out.println("Start the car");
	}
	@Test(priority = 1)
	public void PutFirstGear() {
		System.out.println("First Gear");
	}
	@Test(priority = 2)
	public void PutSeondGear() {
		System.out.println("Second Gear");
	}
	@Test(priority = 3)
	public void PutThirdGear() {
		System.out.println("Third Gear");
	}
	@Test(priority = 4)
	public void PutFourthGear() {
		System.out.println("Fourth Gear");
	}
}
