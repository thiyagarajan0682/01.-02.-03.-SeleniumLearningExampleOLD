package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium Learning\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		
		WebElement image1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		image1.click();
		
		WebElement image2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		
		if(image2.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is broken");
		}
		else {
			System.out.println("Image is not broken");
		}
		
		WebElement c = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img"));
		
		Actions action = new Actions(driver);
		action.click(c).build().perform();
	}

}
