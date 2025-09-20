package seleniumAutomation.Selenium_AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandaloneTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client/");
		
		//Add username password
		driver.findElement(By.id("userEmail")).sendKeys("shaikh.shaziya@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Shaz@2518");
		driver.findElement(By.id("login")).click();
		
		
		

	}

}
