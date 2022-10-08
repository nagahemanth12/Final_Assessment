package AssessmentWithTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRMProgramForLeaveWithTestNG {
	@Test()
	void HRMApplyLeave() throws InterruptedException
	{
	//	WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.xpath("//nav/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//div/div[1]/div/div[2]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys("2022-09-22");
		driver.findElement(By.xpath("//textarea")).sendKeys("Emergency Situation Please Grant me leave");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	}
	


