package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		
		WebElement elementbutton = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a"));
		elementbutton.click();
		
		WebElement Textboxbutton = driver.findElement(By.xpath("//*[@id=\"menuform:m_input\"]/a/span"));
		Textboxbutton.click();
				
		
		WebElement Namebox = driver.findElement(By.id("j_idt88:name"));
		Namebox.sendKeys("gjhgfjs");
		
		WebElement Appendbox = driver.findElement(By.id("j_idt88:j_idt91"));
		Appendbox.sendKeys("India");
		
		WebElement disabledbox1 = driver.findElement(By.id("j_idt88:j_idt91"));
		boolean isenabled1 = disabledbox1.isEnabled();
		System.out.println(isenabled1);

		//Here it is showing true (result is correct)
		
		WebElement disabledbox2 = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean isenabled2 = disabledbox2.isEnabled();
		System.out.println(isenabled2);
		
		//Here it is showing false (result is correct)
		
		WebElement clearbox = driver.findElement(By.id("j_idt88:j_idt95"));
		clearbox.clear();
		
		WebElement gettextbox = driver.findElement(By.id("j_idt88:j_idt97"));
		String value = gettextbox.getAttribute("value");
		System.out.println(value);
 
	}

}
