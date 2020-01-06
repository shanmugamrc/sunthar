package shanmugam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tools {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/droppable/");
	    driver.manage().window().maximize();
	    WebElement tar=driver.findElement(By.id("draggable"));
	    WebElement des=driver.findElement(By.id("droppable"));
	    Actions act=new Actions(driver);
	   // act.clickAndHold(tar).moveToElement(des).release().build().perform();
	    act.dragAndDrop(tar, des).build().perform();

	}

}
