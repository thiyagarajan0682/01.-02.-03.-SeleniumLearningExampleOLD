package seleniumAdvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\welcome\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		
		List<WebElement> a = driver.findElements(By.tagName("th"));
		System.out.println(a.size());
		
		List<WebElement> b = driver.findElements(By.tagName("tr"));
		System.out.println(b.size());
		
		WebElement c = driver.findElement(By.xpath("//td[normalize-space()='Morrow Arvin']//following::td[1]"));
		String percentage = c.getText();
		System.out.println(percentage );
		
		
		
		
		List<WebElement> allvalues = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberlist = new ArrayList<Integer>();
		
		for (WebElement webElement : allvalues) {
			String individualvalue = webElement.getText().replace("%","");
			numberlist.add(Integer.parseInt(individualvalue));
		}
		
		System.out.println(numberlist);
		
		int smallvalue = Collections.min(numberlist);
		System.out.println(smallvalue);
		
		//td[normalize-space()='20%']//following::td[1]
		
		String smallvaluestring = Integer.toString(smallvalue)+"%";
		
		String finalXpath = "//td[normalize-space()="+"'"+ smallvaluestring + "'"+"]"+"//following::td[1]";
		System.out.println(finalXpath);
		
		WebElement d = driver.findElement(By.xpath(finalXpath));
		d.click(); 
		
	}

}
