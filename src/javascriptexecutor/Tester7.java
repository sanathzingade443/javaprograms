package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester7 {

	public static void main(String[] args) {
		//Verify webpage title without using get title and getcurrenturl
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String actualTitle = (String)jse.executeScript("return document.title");
		String expectedTitle="Sign up for Facebook | Facebook";
		System.out.println("actualTitle="+actualTitle);
		System.out.println("expectedTitle"+expectedTitle);
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("PASS::Title Is Corrrect");
		}
		else {
			System.out.println("FAIL::Title Is In-Corrrect");
			}
		String actualUrl = (String)jse.executeScript("return document.URL");
		String expectedUrl="https://www.facebook.com/signup";
		System.out.println("actualUrl="+actualUrl);
		System.out.println("expectedUrl"+expectedUrl);
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("PASS::Url Is Corrrect");
		}
		else {
			System.out.println("FAIL::Url Is In-Corrrect");

		}
		driver.quit();

	}

}
