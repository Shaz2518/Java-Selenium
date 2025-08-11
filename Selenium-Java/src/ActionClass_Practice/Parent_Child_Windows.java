package ActionClass_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child_Windows {

	public static void main(String[] args) {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();

		driver.findElement(By.className("blinkingText")).click();

		// Getting number of Windows and moving to child Window
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> windowHandle = windows.iterator();

		String parentWindow = windowHandle.next();
		String childWindow = windowHandle.next();

		driver.switchTo().window(childWindow);

		// Extracting text from child Window
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		// Trim username from Text extracted
		String emailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].split("with")[0]
				.trim();
		System.out.println(emailID);

		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("username")).sendKeys(emailID);
	}

}
