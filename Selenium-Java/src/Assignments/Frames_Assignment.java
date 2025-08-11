package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Assignment {

	public static void main(String[] args) {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
	
		//Go to first frame (Top/Bottom)		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		
		//Frame inside frame--> Middle frame (Left/Middle/Right)
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		
		//Extract middle frame text
		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.switchTo().defaultContent();
	}

}
