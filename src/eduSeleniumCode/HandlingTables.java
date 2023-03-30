package eduSeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiate the driver		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//launch application
		driver.get("https://www.w3schools.com/sql/sql_orderby.asp");
		
		WebElement webTable = driver.findElement(By.className("w3-responsive"));
		
		List<WebElement> rows = webTable.findElements(By.tagName("tr"));
		
		System.out.println("Number of rows are " +rows.size());
		
		List<WebElement> columns = webTable.findElements(By.tagName("th"));
		
		System.out.println("Number of columns are " +columns.size());
		
		//*[@id="main"]/div[4]/table/tbody/tr[2]/td[1]
		
		String xpath1 = "//*[@id=\"main\"]/div[4]/table/tbody/tr[";
		String xpath2 = "]/td[";
		String xpath3 = "]";
		String finalXpath;
		
		
		for(int i = 2; i<= rows.size(); i++)
			
		{
			for (int j = 1; j<= columns.size(); j++)
			{
				finalXpath = xpath1 + i + xpath2 + j + xpath3;
				String tableData = driver.findElement(By.xpath(finalXpath)).getText();
				
				System.out.print(tableData);
				
			}
			
			System.out.println();
		}


	}

}


//*[@id="main"]/div[4]/table/tbody/tr[2]/td[1]
//*[@id="main"]/div[4]/table/tbody/tr[2]/td[2]




