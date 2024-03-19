package urlpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wikipedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver;
		driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.wikipedia.org/");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id=\"searchInput\"]")).sendKeys("Artificial intelligence");
		driver.get("https://en.wikipedia.org/wiki/History");
		
		 driver.findElement(By.xpath ("//input[@class=\"cdx-text-input__input\"]")).sendKeys("Artificial intelligence");
		 
	}

}
