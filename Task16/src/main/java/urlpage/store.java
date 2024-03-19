package urlpage;


import org.openqa.selenium.chrome.ChromeDriver;



public class store {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ChromeDriver driver;
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		
        
		
		driver.navigate().to("https://www.demoblaze.com/");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle =  "Store";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		driver.close();
		driver.quit();

	}

}
