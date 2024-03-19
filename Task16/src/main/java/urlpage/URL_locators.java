package urlpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class URL_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 
		 WebDriver driver;
			
			
			driver = new FirefoxDriver();
			
			
			
			driver.navigate().to("https://www.google.com/");
			String actualTitle = driver.getTitle();
			driver.manage().window().maximize();
			driver.findElement(By.id("APjFqb")).click();
			driver.navigate().refresh();
			driver.close();
			
	}}


