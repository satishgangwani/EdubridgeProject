package eduSeleniumCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");
		
		WebDriver driver;
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));	//WebDriverWait wait=new WebDriverWait(driver, 10);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("satishgangwani19");
		
		driver.findElement(By.name("passwd")).sendKeys("Sati1234$");
		
		WebElement signInButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("signinbtn")));
		
		signInButton.click();
	
		
/*
* The following are the Expected Conditions that can be used in Selenium Explicit Wait

alertIsPresent()
elementSelectionStateToBe()
elementToBeClickable()
elementToBeSelected()
frameToBeAvaliableAndSwitchToIt()
invisibilityOfTheElementLocated()
invisibilityOfElementWithText()
presenceOfAllElementsLocatedBy()
presenceOfElementLocated()
textToBePresentInElement()
textToBePresentInElementLocated()
textToBePresentInElementValue()
titleIs()
titleContains()
visibilityOf()
visibilityOfAllElements()
visibilityOfAllElementsLocatedBy()
visibilityOfElementLocated()
		 */
	}

}
