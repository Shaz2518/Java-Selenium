package Streams_LamdaExp;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class WebTable_Sorted {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "\\Users\\localadminuser\\Documents\\Drivers\\Latest-139\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on Sorting name
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Storing list
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		
		//Capture text of original List
		List<String> originalList = list.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//Sort the original list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		//Compare if its same as original
		Assert.assertTrue(originalList.equals(sortedList));
		
		//Get price of respective element --> Pagination
		List<String> price;
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s->s.getText().contains("Rice"))
					.map(s->getVeggiePrice(s)).collect(Collectors.toList());
			if(price.size()<1)
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}while(price.size()<1);
		
		price.forEach(a->System.out.println(a));

	}

	private static String getVeggiePrice(WebElement s) {
		String priceOfElement = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceOfElement;
	}

}
