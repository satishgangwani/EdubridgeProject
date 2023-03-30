package eduSeleniumCode;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate the driver		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// A new window is opened and switches to it
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		// Loads Sauce Labs open source website in the newly opened window
		driver.get("https://www.google.com");
		
		
		//launch application
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		String n = Keys.chord(Keys.CONTROL, Keys.ENTER);
	      //open link in new tab
	    driver.findElement(By.linkText("Forgot Password?")).sendKeys(n);
	    /*
	   //ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
	    	//OR
	   //Set<String> s = driver.getWindowHandles();
	   //ArrayList<String> w = new ArrayList<String>(s);
	    	//OR
	    
	   // Set<String> s = driver.getWindowHandles();
	   // ArrayList<String> w = new ArrayList<String>();
	   // w.addAll(s);
	    
	    //switch to open tab
	    System.out.println(w.addAll(s));
	    System.out.println(w);
	    System.out.println(w.get(0));
	    System.out.println(w.get(1));
	    driver.switchTo().window(w.get(1));
	      
	    System.out.println("New tab title: " + driver.getTitle());
	    //switch to first tab
	    driver.switchTo().window(w.get(0));
	    System.out.println("First tab title: " + driver.getTitle());
	    driver.quit();
	*/
	}

}
