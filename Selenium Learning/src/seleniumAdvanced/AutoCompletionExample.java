package seleniumAdvanced;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletionExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		WebElement a = driver.findElement(By.id("******"));
		a.sendKeys("Chenn");
		
		Thread.sleep(4000);
		
		List<WebElement> b = driver.findElements(By.xpath("**************/li"));
		System.out.println(b.size());
		
		for (WebElement webElement : b) {
			
			if(webElement.getText().equals("Chennai")) {
				webElement.click();
				break;
			}
		}		
	}

}
