package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Update_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		//Invoke Browser
				System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
						
				//Navigate to webpage
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
						
				driver.manage().window().maximize();
				
				//Select data
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(2000L);
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				for(int i=1; i<5; i++)
				{
					driver.findElement(By.id("hrefIncAdt")).click();
				}
				driver.findElement(By.id("btnclosepaxoption")).click();
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
