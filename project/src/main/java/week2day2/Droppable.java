package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.switchTo().frame(0);
        
        WebElement myElement = driver.findElementById("draggable");
        
      //  Actions drag = new Actions(driver);
        
        WebElement myElement1 = driver.findElementById("droppable");
        
        Actions drop = new Actions(driver);
    
        drop.dragAndDrop(myElement, myElement1).perform();
        
        
      // drop.clickAndHold(myElement).moveToElement(myElement1, 159, 29).perform();
        
        
    
        
	}

}
