package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {	
	
	@Test
	public void test() {
		//System.setProperty("webdriver.chrome.driver","C:\\opt\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("www.github.com");

	}
	
	

}
