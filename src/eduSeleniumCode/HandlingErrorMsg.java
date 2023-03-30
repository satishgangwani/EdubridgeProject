package eduSeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//jibhHc
		
		//Instantiate the driver		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//launch application
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1912519789%3A1669445861140549&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAsHnBy-r0kCO2dAEjRrjwWy_sMFr0IrEGfKMOyx5yyykhJV0otw1t0XIUd66ErYlhBOfi5s");
	
		driver.findElement(By.name("identifier")).sendKeys("dfjhbmcs");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(2000);
		
		String errmsg = driver.findElement(By.cssSelector("div[jsname = 'B34EJ']")).getText();
		
		System.out.println(errmsg);
		
	
	}

}
