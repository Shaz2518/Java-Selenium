package Miscellaneous_Topic;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Cookies_Demo {

	public static void main(String[] args) {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to webpage
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		// Cookies
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("abc");

	}

}
