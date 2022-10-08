package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Alert {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://netbanking.hdfcbank.com/netbanking/");
		  driver.switchTo().frame("login_page");
		  //finding the element by the linktext
		  driver.findElement(By.linkText("CONTINUE")).click();
		  Alert HdfcAlert=driver.switchTo().alert();
		  Thread.sleep(1000);
		 //click on the alert window
		  HdfcAlert.accept();
}
}
