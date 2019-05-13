package week4day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoomcar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.zoomcar.com/chennai");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
/*		Zoom Car Application

		1. Open Chrome Browser
		2. Open https://www.zoomcar.com/chennai Website
		3. Click on the Start your wonderful journey link
		4. In the Search page, Click on the any of the pick up point under POPULAR PICK-UP POINTS
		5. Click on the Next button
		6. Specify the Start Date as tomorrow Date
		7. Click on the Next Button

		8. Confirm the Start Date and Click on the Done button
		9. In the result page, capture the number of results displayed.
		10. Find the highest value and report the brand name.
		11. click on the Book Now button for it.
		12. Close the Browser.*/
		
		driver.findElementByXPath("//a[@class = 'search']").click();
		
		driver.findElementByXPath("//div[@class = 'terminal'][1]").click();
		
		driver.findElementByXPath("//div[@class = 'gotIt'][1]").click();
		
		driver.findElementByClassName("proceed").click();
		
		driver.findElementByXPath("(//div[@class = 'text'])[3]").click();
		
		driver.findElementByClassName("proceed").click();
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("(//div[@class = 'text'])[4]").click();
		 
		driver.findElementByClassName("proceed").click();
		
		Thread.sleep(1000);
		
		 List<WebElement> rows =driver.findElementsByXPath("//div[@class='details']"); 
		
		 for (int i = 0; i < rows.size(); i++) {
			 
				WebElement eachRow = rows.get(i);
				
				List<WebElement> input = eachRow.findElements(By.tagName("h3")); 
				
				for (int j = 0; j < input.size(); j++)
					
				{
				
				String out = input.get(j).getText();
				
				System.out.println(out);
				
				}
		 }
		
		
		
		

	}

}
