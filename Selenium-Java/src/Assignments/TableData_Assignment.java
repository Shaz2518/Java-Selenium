package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData_Assignment {

	public static void main(String[] args) {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Scroll to table
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,480)");
		
		//Count number of rows
		int rowCount = driver.findElements(By.xpath("//table[@class='table-display'] /tbody /tr")).size();
		System.out.println("Number of rows: " + rowCount);
		
		//count number of columns
		int colCount = driver.findElements(By.xpath("//table[@class='table-display'] /tbody /tr /th")).size();
		System.out.println("Number of Column is: " + colCount);
		
		//Print data of Second Row
		System.out.println(driver.findElement(By.xpath("//table[@class='table-display'] /tbody /tr[3]")).getText());
	}

}
