package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMDashboardWithLinkText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("PIM")).click();//click on sidebar PIM
	    driver.findElement(By.linkText("Leave")).click();//click on sidebar Leave
	    driver.findElement(By.linkText("Time")).click();//click on sidebar Time
	    driver.findElement(By.linkText("Recruitment")).click();//click on sidebar Recruitment
	    driver.findElement(By.linkText("My Info")).click();//click on sidebar My Info

}
}
