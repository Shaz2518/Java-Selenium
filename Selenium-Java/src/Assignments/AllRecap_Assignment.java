package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllRecap_Assignment {

	public static void main(String[] args) {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Click on checkbox and grab its text
		driver.findElement(By.id("checkBoxOption3")).click();
		String name = driver.findElement(By.xpath("//label[@for='honda']")).getText();
		System.out.println(name);
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select option = new Select(dropdown);
		option.selectByVisibleText(name);
		driver.findElement(By.id("dropdown-class-example")).sendKeys(name);
		
		
		

	}

}
