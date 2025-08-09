package End_To_End_Project;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E_ECommerce_AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// Invoke Browser
		System.setProperty("webdriver.driver.chrome", "/Users/localadminuser/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Get Product Array
		String[] listItem = { "Cucumber", "Carrot", "Mushroom", "Banana", "Mango", "Raspberry", "Almonds", "Walnuts" };

		// Navigate to webpage
		Thread.sleep(3000);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();

		// Store the array into ArrayList
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));  //Stores all the items in List
		for (int i = 0; i < products.size(); i++) {											 // Iterate through all elements
			String[] prodName = products.get(i).getText().split("-");						 // Split the name as per given Array
			String formatName = prodName[0].trim();											 // Trim all the spaces in the product name
			List productList = Arrays.asList(listItem);										 // Elements of Arrays are converted into ArrayList

			if (productList.contains(formatName)) {											 // It matches the name with given arrayname and click on it
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == listItem.length)                  									//j--> is used so that it will break the loop once all the items are added to cart.
					break;
			}
		}
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

	}

}
