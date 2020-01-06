package shanmugam;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/automation-practice-switch-windows/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@onclick='newBrwTab()']")).click();
	    String cw=  driver.getWindowHandle();
	    Set<String>aw= driver.getWindowHandles();
	    ArrayList<String> list=new ArrayList<>();
	    list.addAll(aw);
	    //driver.switchTo().window(list.get(2));
	  	    driver.switchTo().window(list.get(1));
	    driver.close();
	    driver.switchTo().window(cw);
	     driver.quit();
	  
	  
	  


	}

}
