package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.GoogleSearchPage;

public class GoogleSearchText {
	
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		googleSearch();
		
	}

	
	public static void googleSearch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jithe\\OneDrive\\Desktop\\Automation\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//goto google.com	
		
		driver.get("https://google.com");
		
		//enter text in search textbox
		//driver.findElement(By.name("q")).sendKeys("Automation tutorial");
		GoogleSearchPage.text_search(driver).sendKeys("Automation POM");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		//close the browser
		driver.close();
		
		System.out.println("Test Completed Successfully");
	}
}
