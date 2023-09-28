package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest {
WebDriver driver; 
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonal\\eclipse-workspace\\FreeCrmAplication\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://classic.freecrm.com/index.html");
		driver.manage().window().maximize();
	    }

	@When("User enter {string} as username")
	public void user_enter_as_username(String string) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("AmolDombale");
	    
	}

	@When("User enter {string} as password")
	public void user_enter_as_password(String string) {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amol@5793");
	    
	}

	@And("User click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();;
	    
	}

	@Then("User is login successfully")
	public void user_is_login_successfully() {
	   
	}
	
	

	@When("user is verify the logo")
	public void user_is_verify_the_logo() {
	    driver.findElement(By.xpath("//*[@class=\\\"img-responsive\\\"])[1]")).click();
	}

	@Then("user is verify company logo successfuly")
	public void user_is_verify_company_logo_successfuly() {
	    
	    
	}
	
	@When("user is verify the click on signuplink")
	public void user_is_verify_the_click_on_signuplink() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
	    
	}

	@Then("user is verify signuplink successfuly")
	public void user_is_verify_signuplink_successfuly() {
		
	    
	}
	
    @When("user is verify the click on homelink")
	public void user_is_verify_the_click_on_homelink() {
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	    
	}

	@Then("user is verify click homelink successfuly")
	public void user_is_verify_click_homelink_successfuly() {
	    
	}
	@Given("Login into Application")
	public void login_into_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonal\\eclipse-workspace\\FreeCrmAplication\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://classic.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("AmolDombale");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amol@5793");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	}
	@When("verify home tab")
	
	public void verify_home_tab() {
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[text()='Home']")).isDisplayed();
		
		
	}
	@When("verify calender tab")
	public void verify_calender_tab() {
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Calendar')]")).click();
		
	    }
	 
	
	@When("verify Companies  tab")
	public void verify_companies_tab() {
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Companies')]")).click();
	}
	@When("verify Contacts tab")
	public void verify_contacts_tab() {
		driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	    
	}

	@When("verify Deals tab")
	public void verify_deals_tab() {
		driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//a[contains(text(),'Deals')]")).click();
	    
	    
	}

	@When("verify Tasks tab")
	public void verify_tasks_tab() {
		driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//a[contains(text(),'Tasks')]")).click();
	    
	    
	}
	@When("verify  Cases tab")
	public void verify_cases_tab() {
		driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//a[contains(text(),'Cases')]")).click();
	    
	}

	@When("verify Call tab")
	public void verify_call_tab() {
		driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//a[contains(text(),'Call')]")).click();
	    
	}

	@When("verify Email tab")
	public void verify_email_tab() {
		driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//a[contains(text(),'Email')]")).click();
	    
	}

	@When("verify  TextSMS tab")
	public void verify_text_sms_tab() {
		driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//a[contains(text(),'Text/SMS')]")).click();
	    
	}
	@When("verify  Print tab")
	public void verify_print_tab() {
		driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//a[contains(text(),'Print')]")).click();
	    
	}

	@When("verify Campaigns tab")
	public void verify_campaigns_tab() {
		driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//a[contains(text(),'Campaigns')]")).click();
	    
	}

	@When("verify  Docs tab")
	public void verify_docs_tab() {
		driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//a[contains(text(),'Docs')]")).click();
	    
	}

	@When("verify Forms tab")
	public void verify_forms_tab() {
		driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//a[contains(text(),'Forms')]")).click();
	    
	}

	@When("verify  Reports tab")
	public void verify_reports_tab() {
		driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
	    
	}
   }
