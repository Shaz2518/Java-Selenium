package Assignments;

import java.awt.event.WindowStateListener;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildWindow_Assignment {

	public static void main(String[] args) {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		//Click Window
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		
		//Store Window Handles and extract text
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> windowHandles = windows.iterator();
		
		String parentWindow = windowHandles.next();
		String childWindow = windowHandles.next();
		
		//Switch to child window
		driver.switchTo().window(childWindow);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		//Switch back to parent Window
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
	}

}
