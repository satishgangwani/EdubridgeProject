package eduSeleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Instantiate the driver		
System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

//Launch the browser
WebDriver driver = new ChromeDriver();

//Navigate to specific URL
driver.get("https://www.google.co.in");

//Get the browser title
String browserTitle = driver.getTitle();
System.out.println(browserTitle);

String browserURL = driver.getCurrentUrl();
System.out.println(browserURL);

String browserWindowHandle = driver.getWindowHandle();
System.out.println(browserWindowHandle);

driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");;
System.out.println(driver.getTitle());

driver.navigate().back();
System.out.println(driver.getTitle());

driver.navigate().forward();
System.out.println(driver.getTitle());

driver.navigate().refresh();

driver.manage().window().maximize();












	}

}
