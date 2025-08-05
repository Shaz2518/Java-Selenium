package Locators;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Invoke_Browser {

	public static void main(String[] args) {
		
		//Invoking a Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\localadminuser\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Navigating to Website
		driver.get("https://www.rahulshettyacademy.com");
		
		//Get Title of Website
		System.out.println(driver.getTitle());
		
		//Get URL of Browser
		System.out.println(driver.getCurrentUrl());
		
		//Quit Browser
		driver.close();
		driver.quit();

	}

}
