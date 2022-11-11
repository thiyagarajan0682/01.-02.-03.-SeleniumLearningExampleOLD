package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		WebElement a1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
		WebElement a4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[4]"));
		WebElement a5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[5]"));
		a1.click();
		a4.click();
		a5.click();
		
		WebElement b = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		boolean k1 = b.isSelected();
		System.out.println(k1);
		
		WebElement c1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		WebElement c2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		if (c1.isSelected()) {
			c1.click();
		}
		if (c2.isSelected()) {
			c2.click();
		}
		
		WebElement d1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]"));
		WebElement d2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]"));
		WebElement d3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]"));
		WebElement d4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]"));
		WebElement d5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[5]"));
		WebElement d6 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[6]"));
		d1.click();
		d2.click();
		d3.click();
		d4.click();
		d5.click();
		d6.click();
		d4.click();
		d6.click();
			
		
	}

}
