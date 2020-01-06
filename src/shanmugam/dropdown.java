package shanmugam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
	    driver.manage().window().maximize();
	    WebElement v=driver.findElement(By.name("coffee"));
	    Select sel=new Select(v);
	    sel.selectByIndex(1);
	    List<WebElement> e=sel.getOptions();
	    for(WebElement q:e) {
	    	System.out.println(q.getText());
	    }
	    if(sel.isMultiple()) {
	    	sel.selectByIndex(2);
	    	sel.selectByIndex(5);
	    	sel.selectByIndex(1);
	    }
	    else {
	    	sel.selectByIndex(1);
	    }
	    System.out.println(sel.getFirstSelectedOption().getText());

	}

}
