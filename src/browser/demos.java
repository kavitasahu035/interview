package browser;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import package1.car;

public class demos {

	public static void main(String[] args) {
		//car c=new car();
	//	c.start();
		
	
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		///driver.get("http://facebook.com");
		//driver.get("file:///C:/Users/MuleSoft/Desktop/demo.html");
		//driver.get("http:Flipkart.com");
	   /*WebElement searchbox= driver.findElement(By.name("q"));
	   searchbox.sendKeys("phones");
	   searchbox.submit();
	  List<WebElement>list_of_Webelement= driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	  int length=list_of_Webelement.size();
	  System.out.println(length);
	  if(length!=0)
	  {
		  for(WebElement input_list_of_Webelement:list_of_Webelement) {
			  String mob_list=input_list_of_Webelement.getText();
			  System.out.println(mob_list);
		  }
	  }
		  // System.out.println();
	   }
		//driver.findElement(By.xpath("//a[contains(@href,'products')]")).click();*/
		//driver.findElement(By.class("_1wE2Px")).click();
		//WebElement Electronics =driver.findElement(By.linkText("Eletronics"));
		//Select audio=new Select(Electronics);
		//audio.selectByVisibleText("Audio");
	  // driver.findElement(By.xpath("//a[normalize-space()='Bluetooth Headphones']"));
		driver.get("http://gmail.com");
		driver.findElement(By.linkText("Help")).click();
		Set<String>AllWindows=driver.getWindowHandles();
		Object[]Windows=AllWindows.toArray();
		String window1 = Windows[0].toString();
		String window2 = Windows[1].toString();
		driver.switchTo().window(window2);
	//	driver.findElement(By.xpath"//input[@name='q']").sendKeys("kavita");
		driver.findElement(By.xpath("//a[.//span[text()='Sign in']]")).click();
		driver.switchTo().window(window1);
		driver.findElement(By.id("identifierId")).sendKeys("demo");
	}
	
}
