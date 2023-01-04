package explicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester2 {
    /*login and logout application without using 
	1.Implicit Wait
	2.Explicit Wait
	3.Thread.sleep
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		for(int i=0;i<=100;i++) {
			System.out.println("Try Number="+i);
			try {
				driver.findElement(By.id("logoutLink")).click();
				break;
			}
			catch(NoSuchElementException e) {
				
			}
		}
		driver.quit();

	}

}
