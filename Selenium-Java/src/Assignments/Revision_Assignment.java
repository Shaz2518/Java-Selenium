package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Revision_Assignment {

	public static void main(String[] args) {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\localadminuser\\Documents\\Drivers\\Latest-139");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		//Fill form
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("John@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("John@123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		
		WebElement option = driver.findElement(By.id("exampleFormControlSelect1"));
		Select list = new Select(option);
		
		list.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("25/02/1997");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		String login = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		
		System.out.println(login);
	}

}
