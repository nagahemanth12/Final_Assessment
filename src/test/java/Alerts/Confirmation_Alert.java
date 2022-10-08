package Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Alert {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Alerts.html ");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Alert confirm_alert = driver.switchTo().alert();
	Thread.sleep(1000);
	confirm_alert.dismiss();

}
}
