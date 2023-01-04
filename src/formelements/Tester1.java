package formelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {
	//Program to handle form elements
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.exe", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
		WebElement regForm = driver.findElement(By.id("reg"));
		
		regForm.findElement(By.name("firstname")).sendKeys("test123");
		regForm.findElement(By.name("lastname")).sendKeys("Testing123");
		regForm.findElement(By.name("reg_email__")).sendKeys("1234567891");

	}

}
