package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01ie0emnw8ygtdryfxgyu3zkfg12950.node0");
		
		WebElement clickbutton = driver.findElement(By.id("j_idt88:j_idt90"));
		clickbutton.click();
		
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01ie0emnw8ygtdryfxgyu3zkfg12950.node0");
		
		WebElement disabledbutton = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean isenabled =disabledbutton.isEnabled();
		System.out.println(isenabled);
		
		//Here it is showing false (result is correct)
		
		
		WebElement positionButton = driver.findElement(By.id("j_idt88:j_idt94"));
		Point xyvalue = positionButton.getLocation();
		int xvalue = xyvalue.getX();
		int yvalue = xyvalue.getY();
		System.out.println("x value is " + xvalue + " and " + "y value is " + yvalue);
		
		
		WebElement colourButton = driver.findElement(By.id("j_idt88:j_idt96"));
		String colour = colourButton.getCssValue("color");
		System.out.println(colour);
		
		WebElement hwbutton = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = hwbutton.getSize().getHeight();
		int width = hwbutton.getSize().getWidth();
		System.out.println("height is " + height + " and " + "width is " + width);
			 
	}

}
 