package eduSeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Instantiate the driver	
		
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//launch application
		driver.get("https://www.spotify.com/in-en/signup");
		
		WebElement dropdown = driver.findElement(By.id("month"));
		
		Select dropDownObj = new Select(dropdown);
		
		Thread.sleep(3000);
		
		dropDownObj.selectByVisibleText("February");
		
		
		
		
		/*
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//launch application
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement dropdown = driver.findElement(By.cssSelector("select[name ^= 'DOB_Day']"));
		
		Select dropDownObj = new Select(dropdown);
		
		Thread.sleep(3000);
		
		dropDownObj.selectByVisibleText("10");
		
		Thread.sleep(3000);
		
		dropDownObj.selectByIndex(2);
		
		Thread.sleep(3000);
		
		dropDownObj.selectByValue("07");
		
		List<WebElement> e =  dropDownObj.getOptions();
		
		System.out.println(e.size());
		
		for(WebElement day:e)
		{
			System.out.println(day.getText());
		}
		*/
		
		
		
		
		
		
		
	}

}
