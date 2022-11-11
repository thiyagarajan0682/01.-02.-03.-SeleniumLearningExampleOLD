package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	
	@Test
	@Parameters("NAME")
	public void printname(String name) {
		System.out.println("My name is " + name);
		
	}

}
