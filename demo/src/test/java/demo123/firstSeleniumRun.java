package demo123;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class firstSeleniumRun {
	@org.junit.Test
	@Test
	
	public void pleaseRun() {
		
		
		
		
	  System.setProperty("webdriver.chrome.driver","C:\\opt\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver(); 
	  driver.get("http://www.google.com");
		  
		 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		

	
		
		
	}
	
	
	
}
