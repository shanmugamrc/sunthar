package shanmugam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	    WebElement v=driver.findElement(By.xpath("//a[@title='Women']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(v).build().perform();

	}

}

