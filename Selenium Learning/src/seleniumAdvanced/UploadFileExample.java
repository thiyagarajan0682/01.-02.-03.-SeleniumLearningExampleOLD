package seleniumAdvanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node095gl6xceeasg1nynwknaccx2w190790.node0");
		
		WebElement upload = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
		upload.click();
		
		Thread.sleep(12000);
		
		String location = "C:\\Users\\welcome\\Downloads\\TestLeaf Logo.png";
		StringSelection selection = new StringSelection(location);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
