package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("******************************");
		
		List<WebElement> elements = driver.findElements(By.xpath("**************/li"));
		
		WebElement from = elements.get(6);
		WebElement to = elements.get(0);
		
		Actions action = new Actions(driver);
		action.clickAndHold(from).moveToElement(to).release(to).build().perform();

	}

}
