package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//Count number of checkbox and select any one check box
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of checkboxes: " + checkbox.size());
		
		System.out.println("Before Click: " + driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		System.out.println("After Click: " + driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
		
		//Trip Category
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
		{
			System.out.println("Is Enabled");
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}

}
