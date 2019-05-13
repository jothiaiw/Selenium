package week2day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementById("txtStationFrom").clear();

		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);

		  
		driver.findElementById("txtStationTo").clear();

		driver.findElementById("txtStationTo").sendKeys("CBE",Keys.TAB);
		
		
		//checkbox verification
				WebElement checkBox = driver.findElementById("chkSelectDateOnly");
				if (checkBox.isSelected()) {
				   driver.findElementById("chkSelectDateOnly").click();
				}
				
				Thread.sleep(2000);
				
				//find the table
				WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
				
				
				//go to rows
				List<WebElement> rows = table.findElements(By.tagName("tr")); 
				System.out.println("Row Count: "+rows.size()); 
				
				
				for (int i = 0; i < rows.size(); i++) {
					WebElement eachRow = rows.get(i);
					
					//go to columns
					List<WebElement> columns = eachRow.findElements(By.tagName("td"));

					String out = columns.get(1).getText();
								
					
					
					if (out.startsWith("C"))
					{
					System.out.println(out);
					}
					
				}
				
		
		System.out.println("Success");
		
		
		
		

	}

}
