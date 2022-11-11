package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	
	@Test
	public void nameEqual() {
		
		String name = "agni";
		boolean k1 = true;
		boolean k2 = false;
		
		//if(name.equals("Agni")) {
		//	System.out.println("Correct");
		//}
		//else {
		//	System.out.println("Incorrect");
		//}
		
		Assert.assertEquals(name, "agni");
		Assert.assertNotEquals(name, "AGNI");
		Assert.assertTrue(k1);
		Assert.assertFalse(k2);
		Assert.assertSame(name, "agni");
		Assert.assertNotSame(name, "AGNI");
		
	}

}
