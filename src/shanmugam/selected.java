package shanmugam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	    //driver.manage().window().maximize();
	    driver.findElement(By.xpath("(//a[@title='Dresses']")).click();
	  boolean dis=  driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_1')]")).isDisplayed();
	  System.out.println(dis);
	 boolean aaa= driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_1')]")).isSelected();
	 System.out.println(aaa);
	boolean cccc= driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_1')]")).isEnabled();
	System.out.println(cccc);
	    
	    		

	}

}
