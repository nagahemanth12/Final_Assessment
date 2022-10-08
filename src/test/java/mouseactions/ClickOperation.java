package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOperation {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		  
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//navigate to the page
				driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
				driver.manage().window().maximize();
				//click on the element "click for result page"
				driver.findElement(By.id("click")).click();
}
}
