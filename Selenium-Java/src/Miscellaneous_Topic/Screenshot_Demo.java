package Miscellaneous_Topic;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshot_Demo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\localadminuser\\Documents\\Drivers\\Latest-139");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//Take Screenshot
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\localadminuser\\Pictures\\Test\\Testscreen.png"));
	}

}
