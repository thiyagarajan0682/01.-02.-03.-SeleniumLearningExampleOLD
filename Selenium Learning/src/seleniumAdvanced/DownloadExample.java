package seleniumAdvanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node095gl6xceeasg1nynwknaccx2w190790.node0");
		
		WebElement download = driver.findElement(By.xpath("//*[@id=\"j_idt93:j_idt95\"]/span[2]"));
		download.click();
		
		Thread.sleep(12000);
		
		File filelocation = new File("C:\\Users\\welcome\\Downloads");
		
		File[] allfiles = filelocation.listFiles();
		
		for (File file : allfiles) {
			
			System.out.println(file.getName());
			
			if(file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File is downloaded");
				break;
			}
		}
	}
	
}
