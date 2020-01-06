package shanmugam;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php/");
	    driver.manage().window().maximize();
	    TakesScreenshot tk=(TakesScreenshot)driver;
	    File f1=tk.getScreenshotAs(OutputType.FILE);
	    File f2=new File("C:\\Users\\ELCOT\\Desktop\\homePageImage.png");
	    FileHandler.copy(f1, f2);

	}

}
