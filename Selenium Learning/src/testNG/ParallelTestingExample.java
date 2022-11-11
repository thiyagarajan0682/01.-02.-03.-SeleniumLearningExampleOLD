package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestingExample {
	
	@Test
	public void OpenBing() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium Learning\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.quit();
	}
	@Test
	public void OpenGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium Learning\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}
	@Test
	public void OpenYahoo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium Learning\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.quit();
	}
}
