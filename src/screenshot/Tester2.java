package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempFile=ts.getScreenshotAs(OutputType.FILE);
		
		String timestamp=LocalDateTime.now().toString().replace(':', '-');
		String newFilePath="./errorshots/"+timestamp+"FacebookPage.png";
		
		FileUtils.copyFile(tempFile, new File(newFilePath));
		driver.quit();

	}

}
