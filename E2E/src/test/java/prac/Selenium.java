package prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/prasadkondeti/PRASAD/drivers/chromedriver");

		WebDriver driver= new ChromeDriver();

		driver.get("https://amazon.com");
		
		/*System.setProperty("webdriver.chrome.driver", "/Users/prasadkondeti/PRASAD/drivers/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "/Users/prasadkondeti/PRASAD/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https:fb.com");
		
		driver.manage().window().maximize();
		
		driver.quit();
		
		/*System.setProperty("webdriver.chrome.driver", "/Users/prasadkondeti/PRASAD/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://goo.gl/RVdKM9");*/
	}
	


}
