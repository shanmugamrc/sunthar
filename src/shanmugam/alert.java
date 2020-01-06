package shanmugam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/automation-practice-switch-windows/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("alert")).click();
	     Alert al=driver.switchTo().alert();
	     al.accept();
	    
	    
	    

	}

}
