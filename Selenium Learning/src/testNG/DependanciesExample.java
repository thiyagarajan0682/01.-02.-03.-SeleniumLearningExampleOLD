package testNG;

import org.testng.annotations.Test;

public class DependanciesExample {
	
	@Test
	public void HighSchool() {
		System.out.println("High School");
	}
	
	@Test(dependsOnMethods = "HighSchool",enabled = false)
	public void HigherSecondary() {
		System.out.println("Higher Secondary School");
	}

	@Test(dependsOnMethods = "HigherSecondary")
	public void College() {
		System.out.println("College");
	}
}
