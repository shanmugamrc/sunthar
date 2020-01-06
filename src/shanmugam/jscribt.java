package shanmugam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jscribt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("document.getElementById('txtUsername').setAttribute('value','Admin')");
	    js.executeScript("document.getElementById('txtPassword').setAttribute('value','admin123')");
	    WebElement v=driver.findElement(By.id("btnLogin"));
	    js.executeScript("arguments[0].click()", v);
	    js.executeScript("window.scrollBy(0,300)");

	}

}
