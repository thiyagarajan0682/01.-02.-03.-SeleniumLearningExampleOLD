package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		WebElement a = driver.findElement(By.linkText("Go to Dashboard"));
		a.click();
		
		driver.navigate().back();
		
		WebElement b = driver.findElement(By.partialLinkText("Find the URL"));
		String url = b.getAttribute("href");
		System.out.println(url);
		
		WebElement c = driver.findElement(By.linkText("Broken?"));
		c.click();
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("Link is broken");
		}
		
		driver.navigate().back();
		
		//WebElement d = driver.findElement(By.linkText("Go to Dashboard"));
		a.click();
		
		driver.navigate().back();
		
		List<WebElement> e = driver.findElements(By.tagName("a"));
		int numberoflinks = e.size();
		System.out.println(numberoflinks);

	}

}
