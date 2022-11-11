package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups = {"Apple"})
	public void Apple1() {
		System.out.println("Apple1 Testing");
	}
	@Test(groups = {"Apple"})
	public void Apple2() {
		System.out.println("Apple2 Testing");
	}
	@Test(groups = {"Lenovo"})
	public void Lenovo1() {
		System.out.println("Lenovo1 Testing");
	}
	@Test(groups = {"Lenovo"})
	public void Lenovo2() {
		System.out.println("Lenovo2 Testing");
	}
	@Test(groups = {"Moto"})
	public void Moto1() {
		System.out.println("Moto1 Testing");
	}
	@Test(groups = {"Moto"})
	public void Moto2() {
		System.out.println("Moto2 Testing");
	}
	@Test(groups = {"Vivo"})
	public void Vivo1() {
		System.out.println("Vivo1 Testing");
	}
	@Test(groups = {"Vivo"})
	public void Vivo2() {
		System.out.println("Vivo2 Testing");
	}
}
