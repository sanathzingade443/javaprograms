package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		
		for(;;) {
			try {
				driver.findElement(By.linkText("Mother's Day 2021 (October 17)")).click();
				break;
			}
			catch(NoSuchElementException e) {
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("scrollBy(0,1000);");
			}
		}
		String expectedurl = "Mother's Day 2021 (October 17)";
		String actualurl = driver.getCurrentUrl();
		System.out.println("expectedurl="+expectedurl);
		System.out.println("actualurl="+actualurl);

	
	
	try {
		wait.until(ExpectedConditions.urlContains(expectedurl));
		System.out.println("PASS::Mothers day page is loaded");
	}
 catch(TimeoutException e) {
	 System.out.println("FAIL");
 }
	driver.quit();
	}
}
