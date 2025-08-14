
package Miscellaneous_Topic;

import org.openqa.selenium.WebDriver;
import java.util.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SSLCertificate_Bypass {

	public static void main(String[] args) {
		
		//Options class to bypass ssl error
		EdgeOptions option = new EdgeOptions();
		option.setAcceptInsecureCerts(true);
		
		//Invoke browser
		System.setProperty("webdriver.edge.driver", "/Users/localadminuser/Documents/Drivers/Latest-139/msedgedriver.exe");
		WebDriver driver = new EdgeDriver(option);
		
		//Navigate to http website
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();

		//Grab title of webpage
		System.out.println(driver.getTitle()); 
		
	}

}
