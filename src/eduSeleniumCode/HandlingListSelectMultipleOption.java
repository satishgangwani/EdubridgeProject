package eduSeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingListSelectMultipleOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		
		//implicit wait
		
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		      //maximize browser
		      driver.manage().window().maximize();
		      //URL launch
		      driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		      //identify dropdown
		      WebElement d= driver.findElement(By.xpath("//select[@name='selenium_commands']"));

		      //object of Select class
		      Select s=new Select(d);
	      //select item by index
		      s.selectByIndex(2);
		      Thread.sleep(1000);
		      //select item by visible text
		      s.selectByVisibleText("Wait Commands");
		      Thread.sleep(1000);
	
		      //get options of dropdown in list
		      List t =s.getOptions();
		      System.out.println("Options are: ");
		      for (WebElement i: t){
		         System.out.println(i.getText());
		      }
		      //return true if multi-select dropdown
		      Boolean b=s.isMultiple();

		      System.out.println("Boolen value for drodown: "+ b);
	
	
	
	}

}
