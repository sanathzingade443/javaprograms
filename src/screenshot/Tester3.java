package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;

public class Tester3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		HasFullPageScreenshot ts=(HasFullPageScreenshot)driver;
		File tempfile=ts.getFullPageScreenshotAs(OutputType.FILE);
		
		String timestamp=LocalDateTime.now().toString().replace(':', '-');
		String newfilePath="./errorshots/"+timestamp+"FacebookFullPage.png";
		FileUtils.copyFile(tempfile, new File(newfilePath));
		driver.quit();

	}

}
