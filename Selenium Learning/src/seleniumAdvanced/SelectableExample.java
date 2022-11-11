package seleniumAdvanced;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("*************************************");
		
		List<WebElement> selectable = driver.findElements(By.xpath("******************/li"));
		System.out.println(selectable.size());		
		
		Actions action = new Actions(driver);
		action.clickAndHold(selectable.get(0)).clickAndHold(selectable.get(1)).clickAndHold(selectable.get(2)).build().perform();
		//action.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
		
	}

}
