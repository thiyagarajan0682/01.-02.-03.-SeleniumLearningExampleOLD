package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeSuiteExample {
	
	WebDriver driver;
	Long starttime;
	Long endtime;
	Long totaltime;
	
	@BeforeSuite
	public void OpenBrowser() {
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromedriver.exe");
		driver  = new ChromeDriver();
	}
	@Test
	public void OpenBing() {
		driver.get("https://www.bing.com/");
	}
	@Test
	public void OpenGoogle() {
		driver.get("https://www.google.com/");	
	}
	@Test
	public void OpenYahoo() {
		driver.get("https://in.search.yahoo.com/?fr2=inr");				
	}
	
	@AfterSuite
	public void CloseBrowser() {
		
		driver.quit();
		endtime = System.currentTimeMillis();
		totaltime = endtime-starttime;
		System.out.println(totaltime);
	}
}
