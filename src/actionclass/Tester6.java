package actionclass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tester6 {
	//Program to perform scrollup and scrolldown using ACTION page
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://qspiders.com/");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.END,Keys.PAGE_DOWN).perform();
		Thread.sleep(10000);
		action.sendKeys(Keys.HOME,Keys.PAGE_UP).perform();
		driver.quit();

	}

}
