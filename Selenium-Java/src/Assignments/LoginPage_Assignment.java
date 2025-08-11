package Assignments;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		
		//Escape password manager
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("password_manager_enabled", false);
		Map<String, Object> profile = new HashMap<String, Object>();
		profile.put("password_manager_leak_detection", false);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// Navigate to webpage
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		//Enter username password and radio button
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		//Explicit Wait and Handle Alert Box
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		//Option from Static Drop Down
		WebElement option = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(option);
		dropdown.selectByValue("consult");
		
		//Accept Term by clicking checkbox
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//Explicit wait for cart
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.my-4")));
		
		//Iterate through item and add to cart
		List<WebElement> item = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		
		for(WebElement optionList : item)
		{
			optionList.click();
		}
		
		//Checkout
		driver.findElement(By.className("btn-primary")).click();
	}

}
