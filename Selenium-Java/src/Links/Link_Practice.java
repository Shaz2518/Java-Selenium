package Links;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Link_Practice {

	public static void main(String[] args) throws InterruptedException {
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
		
		//Open all links in new tab and get the title of Window
		for(int i=1; i<firstCol; i++)
		{
			String linkClick = Keys.chord(Keys.CONTROL,Keys.ENTER);
			firstColDriver.findElements(By.tagName("a")).get(i).sendKeys(linkClick);
		}
		Thread.sleep(5000);
		
		//Get Titles of the Webpage
		System.out.println("The Title of Each Tab: ");
		Set<String> windowsHandle = driver.getWindowHandles();
		Iterator<String> nextWindow = windowsHandle.iterator(); 
		
		while(nextWindow.hasNext())
			{
				driver.switchTo().window(nextWindow.next());
				System.out.println(driver.getTitle());
		}
		

	}

}
