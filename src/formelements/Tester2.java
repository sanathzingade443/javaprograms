package formelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/stocks/marketstats/hourly_gain/nse/curr_hour/index.php");
		
		WebElement sensextable = driver.findElement(By.id("moving_avg"));
		List<WebElement> tableHeaderList = sensextable.findElements(By.tagName("th"));
		for(WebElement ele:tableHeaderList) {
			System.out.println(ele.getText());
		}
		int expectedTHCount=3;
		int actualTHCount=tableHeaderList.size();
		System.out.println("expectedTHCount="+expectedTHCount);
		System.out.println("actualTHCount="+actualTHCount);
		if(actualTHCount==expectedTHCount) {
			System.out.println("PASS::The Table Header Count Is Correct");
		}
		else {
			System.out.println("FAIL::The Table Header Count Is Not Correct");
			
		}
		
		List<WebElement> tableRowList = sensextable.findElements(By.tagName("tr"));
		for(WebElement ele:tableRowList) {
			System.out.println(ele.getText());
		}
		int expectedRowCount=5;
		int actualRowCount=tableRowList.size();
		System.out.println("expectedRowCount="+expectedRowCount);
		System.out.println("actualRowCount="+actualRowCount);
		if(actualRowCount==expectedRowCount) {
			System.out.println("PASS::The Table Row Count Is Correct");
		}
		else {
			System.out.println("FAIL::The Table Row Count Is Not Correct");
			
		}
		
		List<WebElement> tableDataList = sensextable.findElements(By.tagName("td"));
		for(WebElement ele:tableDataList) {
			System.out.println(ele.getText());
		}
		int expectedTDCount=5;
		int actualTDCount=tableRowList.size();
		System.out.println("expectedTDCount="+expectedTDCount);
		System.out.println("actualTDCount="+actualTDCount);
		if(actualTDCount==expectedTDCount) {
			System.out.println("PASS::The Table Data Count Is Correct");
		}
		else {
			System.out.println("FAIL::The Table Data Count Is Not Correct");
			
		}
		
		driver.quit();
		

	}

}
