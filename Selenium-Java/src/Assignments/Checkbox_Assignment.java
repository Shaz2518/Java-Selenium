package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Assignment {

	public static void main(String[] args) {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Number of Checkboxes
		int chknumber = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println("Number of checkboxes are: " + chknumber);
		
		//Check firstOption 
		System.out.println("Before Click " + driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println("After Click " + driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

		//Uncheck the Selected Option
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println("After Uncheck " + driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
	}

}
