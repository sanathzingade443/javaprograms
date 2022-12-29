package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {
//Program to get screenshot of a page
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempFile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(tempFile, new File("GooglePage.png"));
		
		driver.quit();

	}

}
