package explicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester1 {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//author hulk
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		try {
			wait.until(ExpectedConditions.titleIs("actiTIME -  Enter Time-Track"));
			System.out.println("PASS::Home Page Is Displayed");
			}
		catch(TimeoutException e){
			System.out.println("FAIL::Home Page Is Not Displayed");
			
		}
		
		driver.findElement(By.id("container_users")).click();
		try {
			wait.until(ExpectedConditions.urlContains("userlist.do"));
			System.out.println("PASS::User Page Is Displayed");
		}
		catch(TimeoutException e) {
			System.out.println("FAIL::User Page Is Not Displayed");
		}
		driver.quit();
	}

}
