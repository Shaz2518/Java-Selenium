import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkFlow_Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\localadminuser\\Documents\\Drivers\\Latest-139\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(5));

		driver.get("http://10.178.115.114:81/workflow_1_page1.aspx");
		driver.findElement(By.xpath("//input[@value='Open a Popup']")).click();

		closeWindow(driver);
		
		driver.findElement(By.xpath("//input[@onclick='OpenPopupWindowOnTimer();']")).click();
		//explicitWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Open Modal']"))));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		closeWindow(driver);
		driver.findElement(By.xpath("//button[text()='Open Modal']")).click();
		
		driver.findElement(By.cssSelector("span[class*='w3-button']")).click();
		
		driver.findElement(By.id("modeless_button")).click();
		driver.switchTo().frame(0).findElement(null)
		
		
;	}
	
	public static void closeWindow(WebDriver driver)
	{
		// Store the current window handle
				String mainWindowHandle = driver.getWindowHandle();

				// Get all window handles
				for (String handle : driver.getWindowHandles()) {
					if (!handle.equals(mainWindowHandle)) {
						// Switch to the other window
						driver.switchTo().window(handle);
						// Close the other window
						driver.close();
					}
				}
				// Switch back to the main window
				driver.switchTo().window(mainWindowHandle);
	}

}
