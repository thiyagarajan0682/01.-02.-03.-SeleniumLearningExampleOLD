package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement from = driver.findElement(By.id("form:drag_content"));
		WebElement to = driver.findElement(By.id("form:drop_content"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(from).moveToElement(to).release(to).build().perform();
		//action.dragAndDrop(from, to).build().perform();

	}

}
