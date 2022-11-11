package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Calendar.html");
		//jquery calendar
		
		WebElement calendar = driver.findElement(By.id("datepicker"));
		//below line could be used only if the calendar has text box using which we can type the date.
		//calendar.sendKeys("10/09/2022"+Keys.ENTER);
		
		
		calendar.click();	
		WebElement nextbutton = driver.findElement(By.xpath("//a[@title='Next']"));
		nextbutton.click();
		
		WebElement DateToBeGiven = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		DateToBeGiven.click();
	}

}
