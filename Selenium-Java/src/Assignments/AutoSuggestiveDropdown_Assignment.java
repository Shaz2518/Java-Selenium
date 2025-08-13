package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Enter text in textbox for suggestion
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1'] /li"));
		
		for(WebElement item : list)
		{
			if(item.getText().equalsIgnoreCase("Indonesia"))
			{
				item.click();
				break;
			}
		}
		
		String dropdown = driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value");
		System.out.println(dropdown);
	}

}
