package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		
		WebElement a = driver.findElement(By.id("yes"));
		a.click();
		
		WebElement b = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]"));
		WebElement c = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]"));
		if(b.isSelected()) {
			System.out.println("unchecked is selected");
		}
		if(c.isSelected()) {
			System.out.println("checked is selected");
		}
		
		WebElement k1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]"));
		WebElement k2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
		WebElement k3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]"));
		if(k1.isSelected()) {
			
		}
		else if (k2.isSelected()) {
			
		}
		else if (k3.isSelected()) {
			
		}
		else {
			k1.click();
		}
		
	}

}
