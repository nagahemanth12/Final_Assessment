package AssessmentWithTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MethodoverLoadingUsingTestNG {
	
	@BeforeTest()
	void login1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.close();
}
	 @Test(dataProvider="DemoData1")
	void search(String userName)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a/span")).click();
		//driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		//driver.findElement(By.xpath("//a/span")).click();
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(userName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}
	  @Test(dataProvider="DemoData")
	void search(String username, String empName)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\hemanth\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a/span")).click();
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}
	 @DataProvider(name="DemoData1")
	   public static Object[][] dataProviderMethod1()
	   {
	      return new Object[][] {{"Hemanth"}};
	   }
	 @DataProvider(name="DemoData")
	   public static Object[][] dataProviderMethod()
	   {
	      return new Object[][] {{"Hemanth","Admin"}};
	   }
}
