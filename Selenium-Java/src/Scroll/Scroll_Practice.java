package Scroll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll_Practice {

	public static void main(String[] args) {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Scroll Window
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//Scroll Table in window
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		//Collect column data and add
		List<WebElement> element = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum =0;
		for(int i=0; i<element.size(); i++)
		{
			sum += Integer.parseInt(element.get(i).getText());
		}
		System.out.println(sum);
		
		String total = driver.findElement(By.cssSelector("div[class='totalAmount']")).getText();
		String finalTotal = total.split(":")[1];
		int amountTotal = Integer.parseInt(finalTotal.trim());
		System.out.println(amountTotal);
		
		Assert.assertEquals(sum, amountTotal);
		
	}

}
