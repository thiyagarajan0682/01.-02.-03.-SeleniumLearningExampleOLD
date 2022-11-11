package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node016y8f0e1tswpjw7q6n7wjcbrp33121.node0");
		
		WebElement simplealertbutton = driver.findElement(By.id("j_idt88:j_idt91"));
		simplealertbutton.click();
		Alert simplealert = driver.switchTo().alert();
		String msg1 = simplealert.getText();
		System.out.println(msg1);
		Thread.sleep(3000);
		simplealert.accept();
		
		WebElement confirmalertbutton = driver.findElement(By.id("j_idt88:j_idt93"));
		confirmalertbutton.click();
		Alert confirmalert = driver.switchTo().alert();
		String msg2 = confirmalert.getText();
		System.out.println(msg2);
		Thread.sleep(3000);
		confirmalert.dismiss();
		
		WebElement promptalertbutton = driver.findElement(By.id("j_idt88:j_idt104"));
		promptalertbutton.click();
		Alert promptalert = driver.switchTo().alert();
		String msg3 = promptalert.getText();
		System.out.println(msg3);
		promptalert.sendKeys("jfhdfhdh");
		Thread.sleep(3000);
		promptalert.accept();
		

	}

}
