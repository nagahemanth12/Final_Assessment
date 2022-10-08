package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMDashboardWithxpath {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");//username field
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");//password field
driver.findElement(By.xpath("//button[@type='submit']")).click();//click on the submit button
//click on Admin Element on the dashboard
driver.findElement(By.xpath("//div[2]/ul/li[1]/a")).click();
//click on Leave element
driver.findElement(By.xpath("//li[3]/a")).click();
//click on Time element
driver.findElement(By.xpath("//li[4]/a")).click();
//click on the Recruitment
driver.findElement(By.xpath("//li[5]/a")).click();

}}

