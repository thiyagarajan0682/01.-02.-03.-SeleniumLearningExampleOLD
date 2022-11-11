package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownboxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		dropdown1.sendKeys("selenium");
		Thread.sleep(2000);
		
		Select select1 = new Select(dropdown1);
		
		select1.selectByIndex(3);
		Thread.sleep(2000);
		select1.selectByValue("2");
		Thread.sleep(2000);
		select1.selectByVisibleText("Loadrunner");
		Thread.sleep(2000);
		
		List<WebElement> listofoptions = select1.getOptions();
		int size = listofoptions.size();
		System.out.println(size);
		
		
		WebElement b = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select select2 = new Select(b);
		select2.selectByIndex(1);
		select2.selectByIndex(3);
		 
		
		
		
		
		
		
		
		
				

	}

}
