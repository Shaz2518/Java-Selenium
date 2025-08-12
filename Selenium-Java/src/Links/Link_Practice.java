package Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Practice {

	public static void main(String[] args) {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Number of links in Webpage
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println("Complete Page: " + links);
		
		//Number of links in footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		int footerLinks = footerDriver.findElements(By.tagName("a")).size();
		System.out.println("Footer Links: " + footerLinks);
		
		//NUmber of links in 1st column
		WebElement firstColDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		int firstCol = firstColDriver.findElements(By.tagName("a")).size();
		System.out.println("First Column Link: " + firstCol);
		

	}

}
