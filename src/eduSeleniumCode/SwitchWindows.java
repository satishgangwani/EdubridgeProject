package eduSeleniumCode;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

	//Launch the browser
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	String n = Keys.chord(Keys.CONTROL, Keys.ENTER);
	
	driver.findElement(By.linkText("Forgot Password?")).sendKeys(n);
	
	Set<String> s = driver.getWindowHandles();
	ArrayList<String> a = new ArrayList<String>(s);
	
	System.out.println(a);
	System.out.println(a.get(0));
	System.out.println(a.get(1));
	driver.switchTo().window(a.get(1));
	
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(a.get(0));
	
	System.out.println(driver.getTitle());
	
	
	
	
	
	
	
	}

}
