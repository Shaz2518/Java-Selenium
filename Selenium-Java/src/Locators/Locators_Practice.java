package Locators;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Navigate to webpage
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Fill Login Page --> Locators - id, name, classname
		driver.findElement(By.id("inputUsername")).sendKeys("shaziya");
		driver.findElement(By.name("inputPassword")).sendKeys("shaziya");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Forgot Password Form
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("shaziya");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456");
		
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		String password = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		
		//Fill in the correct details in form
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("shaziya");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		
		//driver.findElement(By.id("chkboxOne")).click();
		//driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

}
