package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester4 {
	//Program to do drag and drop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://trello.com/login");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.id("user")).sendKeys("sanathzingade089@gmail.com");
		driver.findElement(By.id("login")).click();
		
		WebElement loginbutton = driver.findElement(By.id("login-submit"));
		wait.until(ExpectedConditions.visibilityOf(loginbutton));
		driver.findElement(By.id("password")).sendKeys("San@9480645208");
		loginbutton.click();
		//Clicking on "dff" page in dash board
		driver.findElement(By.xpath("//div[contains(@class,'board-tile-details is-badged')]")).click();
		//storing the adress of "dff" element
		WebElement sourceEle = driver.findElement(By.xpath("//span[contains(.,'dsdsdd')]"));
		WebElement targetEle = driver.findElement(By.xpath("//h2[text()='Doing']/../..//span[text()='Add a card']"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(sourceEle, targetEle).perform();
		

	}

}
