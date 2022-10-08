package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://www.aptransport.org/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Actions mouse=new Actions(driver);
			
			Thread.sleep(1000);
			//moves on to the taxes session on the page
			mouse.moveToElement(driver.findElement(By.linkText("TAXES"))).build().perform();
			//moves on to the green tax option which is available on the home screen
			mouse.moveToElement(driver.findElement(By.linkText("Green Tax"))).build().perform();
			

}
}
