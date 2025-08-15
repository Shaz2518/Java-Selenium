package Miscellaneous_Topic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		
			// Establish connection and check status code
			String urlLink = driver.findElement(By.cssSelector("a[href*='appium']")).getAttribute("href");
			HttpURLConnection connect = (HttpURLConnection) new URL(urlLink).openConnection();
			connect.setRequestMethod("HEAD");
			int respCode = connect.getResponseCode();
System.out.println(respCode);
			

		}

	}


