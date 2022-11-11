package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=tooltip+example&rlz=1C1FKPE_enIN984IN984&oq=tooltip+e&aqs=chrome.1.69i57j0i20i263i512j0i512l8.3677j0j7&sourceid=chrome&ie=UTF-8");
		
		WebElement a = driver.findElement(By.id("logo"));
		System.out.println(a.getAttribute("title"));
		
	}

}
