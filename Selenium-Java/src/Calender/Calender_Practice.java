package Calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Calender_Practice {

	public static void main(String[] args) {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Navigate to webpage
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		//Select calender date
		String monthSelect = "12";
		String dateSelect = "6";
		String yearSelect = "2027";
		String[] inputDate = {monthSelect,dateSelect,yearSelect};
		
		driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[text()='2027']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[19]")).click();
		driver.findElement(By.xpath("//button/abbr[text()='6']")).click();
		
		List<WebElement> calDate = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0; i<calDate.size(); i++)
		{
			System.out.println(calDate.get(i).getAttribute("value"));
			Assert.assertEquals(calDate.get(i).getAttribute("value"), inputDate[i]);
		}
	
	}

}
