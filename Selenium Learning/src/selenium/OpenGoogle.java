package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author welcome
 *
 */
public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium Learning\\Drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("trichy"+Keys.ENTER);
		
		
		
		
		

	}
}
