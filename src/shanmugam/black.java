package shanmugam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.support.ui.Select;

public class black {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	    String x=driver.getTitle();
	    System.out.println(x);	
	    String b=driver.getCurrentUrl();
	    System.out.println(b);
	    String n=driver.getPageSource();
	    System.out.println(n);

	    WebElement a=driver.findElement(By.id("txtUsername"));
	    a.sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	    
	   

	}

}
