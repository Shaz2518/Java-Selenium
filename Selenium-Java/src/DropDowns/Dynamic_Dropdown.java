package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//Select From-To Destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		System.out.println("From State: " + driver.findElement(By.xpath("//a[@value='BOM']")).getText());
		
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		System.out.println("To State: " + driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).getText());

	}

}
