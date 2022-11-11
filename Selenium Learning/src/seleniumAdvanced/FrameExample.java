package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		System.out.println(button1.getText());
		
		driver.switchTo().defaultContent();
		
		List<WebElement> count = driver.findElements(By.tagName("iframe"));
		System.out.println(count.size());
		
		driver.switchTo().frame(2);
		List<WebElement> count1 = driver.findElements(By.tagName("iframe"));
		System.out.println(count1.size());
		
		driver.switchTo().frame("frame2");
		WebElement button3 = driver.findElement(By.id("Click"));
		button3.click();
		System.out.println(button3.getText());
		
		
	}

}
