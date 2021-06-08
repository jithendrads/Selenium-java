import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserTest {
	
	public static void main(String[] args)
	{
		String projectPath=System.getProperty("user.dir");
		System.out.println("ProjectPath : "+projectPath);
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\iedriver\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		driver.get("https://google.com/");
		WebElement textbox=driver.findElement(By.xpath("//input[@name='q']"));
		List<WebElement> listOfInputElement= driver.findElements(By.xpath("//input"));
		int count=listOfInputElement.size();
		System.out.println(count);
		//WebElement textbox=driver.findElement(By.name("q"));
		textbox.sendKeys("Automation");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
