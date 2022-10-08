package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRM_Functionality_Testing {
	private static WebDriver driver = null;
	@Given("the user enters the browser")
	public void the_user_enters_the_browser() {
		System.setProperty("webdriver.chrome.driver" , "C:\\hemanth\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	}
	@Given("user enters user name and password")
	public void user_enters_user_name_and_password() {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
		String actual=null,expected=null;
		expected="PIM";
		actual=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		        SoftAssert soft = new SoftAssert();
		        soft.assertEquals(actual,expected);
	    
	}

	@Given("Click on the Leave element")
	public void click_on_the_leave_element() {
		driver.findElement(By.linkText("Leave")).click();
		
	}

	@Then("Click on Apply option")
	public void click_on_apply_option() {
		driver.findElement(By.linkText("Apply")).click();
	}

	@Then("Select leave type")
	public void select_leave_type() {
		 driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		 driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
	}

	@Then("Select the dates")
	public void select_the_dates() {
		driver.findElement(By.xpath("//div[@class='oxd-date-input']/input")).sendKeys("2022-02-09");
	}

	@Then("mention the reason")
	public void mention_the_reason() {
		driver.findElement(By.xpath("//textarea")).sendKeys("Personal leave");
	}

	@Then("Click on the Apply Button")
	public void click_on_the_apply_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Given("Click on the admin element")
	public void click_on_the_admin_element() {
	driver.findElement(By.xpath("//a/span")).click();
	search("Peter.Anderson");
	//Thread.sleep(5000);
	search("Admin", "Paul Collings");
	}
	@Then("Give the search inputs")
	public void give_the_search_inputs() {}
	public void search(String userName) 
	{
		driver.findElement(By.xpath("//div[2]/input[@class='oxd-input oxd-input--active']")).sendKeys(userName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
		public void search(String userName, String empName) {
		driver.findElement(By.xpath("//div[2]/input[@class='oxd-input oxd-input--active']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	}
