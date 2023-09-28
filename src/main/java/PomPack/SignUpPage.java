package PomPack;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class SignUpPage {

	
		
		@FindBy (xpath="//a[contains(text(),'Sign Up')]")
		private WebElement signupbutton;//signup click
		
		//Thread.sleep(2000);
	   @FindBy	(xpath="//select[@name='payment_plan_id']")
		private WebElement edition ;
		//Select s = new Select(ListBox);
		//s.deselectByVisibleText("Free Edition");
	   @FindBy	(xpath="//input[@placeholder='First Name']")
		private WebElement FirstName ;
		
		@FindBy (xpath ="//input[@placeholder='Last Name']")
		private WebElement lastName;
		
		//Thread.sleep(2000);
		
	    @FindBy(xpath ="//input[@name=\"email\"]")
	    private WebElement email;
		
		
	    @FindBy	(xpath="//input[@name='email_confirm']")
		private WebElement email_confirm ;
		
		@FindBy (xpath="//input[@name='username']")
		private WebElement username ;
		
		@FindBy (xpath="//input[@name='password']")
		private WebElement password ;
	
		
		@FindBy (xpath="//input[@name='passwordconfirm']")
		private WebElement passwordconfirm ;
		
		
		@FindBy (xpath="//input[@name='agreeTerms']")
		private WebElement agreeTerms;
		
		@FindBy (xpath="//button[@type='submit']")
		private WebElement submit ;
		
		//public constructor (to initialize webelement)
	    public SignUpPage(WebDriver driver) {
	    PageFactory.initElements(driver, this); 
	    }
	    
	    //public methods(action of webelement)
	    public void clicksignupbutton() {
	    	signupbutton.click();
	    }
	    public void clickeditionbutton() {
	    	edition.click();
	    }
	    public void SendFirstName() {
	    	FirstName.sendKeys("sonal");	
	    }
	    public void sendlastname() {
	    	lastName.sendKeys("shende");	
	    }
	    public void sendemail() {
	    	 email.sendKeys("sonalshende3009@gmail.com");	
	    }
	    public void sendconfirmemail() {
	    	email_confirm.sendKeys("sonalshende3009@gmail.com");
	    	}
	    
	    public void sendusername() {
	    	username.sendKeys("sonal30");	
	    }
	    
	    public void sendpassword() {
	    	password.sendKeys("sai@123");	
	    }
	    
	    public void sendpasswordconfirm() {
	    	passwordconfirm.sendKeys("sai@123");	
	    }
		public void clickagriterm() {
			agreeTerms.click();
		}
			
			public void clicksubmit() {
				submit.click();
			}
			//complete functionality
		    public void signupAplication () {
		    	signupbutton.click();
		    	edition.click();
		    	FirstName.sendKeys("sonal");
		    	lastName.sendKeys("shende");
		    	email.sendKeys("sonalshende3009@gmail.com");
		    	email_confirm.sendKeys("sonalshende3009@gmail.com");
		    	username.sendKeys("sonal30");
		        password.sendKeys("sai@123");
		        passwordconfirm.sendKeys("sai@123");
		        agreeTerms.click();
		        submit.click();
		        
	}

}
