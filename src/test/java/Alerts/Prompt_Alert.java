package Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Hemanth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html ");
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert prompt_alert = driver.switchTo().alert();
		System.out.println(prompt_alert.getText());
		prompt_alert.sendKeys("Hemanth");
		Thread.sleep(1000);
		prompt_alert.accept();
}
}
