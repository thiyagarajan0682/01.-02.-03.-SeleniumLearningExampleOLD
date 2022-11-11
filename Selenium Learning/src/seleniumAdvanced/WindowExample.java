package seleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		WebElement open = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
		open.click();
		
		Set<String> allwindows1 = driver.getWindowHandles();
		System.out.println(allwindows1);
		
		for (String childwindow1 : allwindows1) {
			
			driver.switchTo().window(childwindow1);
			
		}
		
		WebElement firstbutton = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a/i[1]"));
		firstbutton.click();
		WebElement secondbutton = driver.findElement(By.xpath("//*[@id=\"menuform:m_window\"]/a"));
		secondbutton.click();
		driver.close();
		
		driver.switchTo().window(parentwindow);
				
		WebElement openmultiple = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
		openmultiple.click();
		
		int noofwindows1 = driver.getWindowHandles().size();
		System.out.println(noofwindows1);
		
		WebElement closewindows = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		closewindows.click(); 
		
		Set<String> allwindows2 = driver.getWindowHandles();
		System.out.println(allwindows2);
		int noofwindows2 = allwindows2.size();
		System.out.println(noofwindows2);
		
		for (String childwindow2 : allwindows2) {
			if(!childwindow2.equals(parentwindow)) {
				driver.switchTo().window(childwindow2);
				driver.close();
			}	
			
		}
		driver.quit();

	}

}
