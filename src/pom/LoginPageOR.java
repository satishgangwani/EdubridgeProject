package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageOR {
	
	WebDriver driver;
	
	By userName = By.id("login1");
	By password = By.id("password");
	By signInBtn = By.className("signinbtn");
	
	public LoginPageOR(WebDriver driver1)
	{
		driver = driver1;
	}
	
	
	public void typeUserName(String uname)
	{
		driver.findElement(userName).sendKeys(uname);
	}
	
	public void typePassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void submitButton()
	{
		driver.findElement(signInBtn).click();
	}

}
