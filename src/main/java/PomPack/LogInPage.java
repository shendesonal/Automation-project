package PomPack;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basepack.BaseClass;


public class LogInPage extends  BaseClass{

	

	//private variables (webelement)
	//private WebDriver driver;
	//private Actions act;
    @FindBy (xpath = "//input[@name='username']")
    private WebElement userName ;
    
    @FindBy (xpath = "//input[@type='password']")
    private WebElement password;
    
    @FindBy (xpath = "//input[@value='Login']")
    private WebElement loginButton ;
    
    @FindBy(xpath = "(//*[@class=\"img-responsive\"])[1]")
	WebElement crmlogo;

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	private WebElement homeLink;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	private WebElement signupLink;

	@FindBy(xpath = "//a[contains(text(),'Pricing')]")
	private WebElement pricinglink;

	@FindBy(xpath = "//a[contains(text(),'Features')]")
	private WebElement FeaturesLink;

	@FindBy(xpath = "//a[contains(text(),'Contact')]")
	private WebElement contactLink;

	@FindBy(xpath = "//a[contains(text(),'Customers')]")
	private WebElement customerslink;
    
	public LogInPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
   
    public boolean verifycrmlogo() {
		return crmlogo.isDisplayed();
	}

	public HomePage login(String un, String pwd, WebDriver WebDriver) throws IOException {
		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		return new HomePage();
	}

	public boolean verifylinks(WebElement link) {
		return link.isDisplayed();
	}

	public WebElement getHomeLink() {
		return homeLink;
	}

	public void setHomeLink(WebElement homeLink) {
		this.homeLink = homeLink;
	}

	public WebElement getCustomerslink() {
		return customerslink;
	}

	public void setCustomerslink(WebElement customerslink) {
		this.customerslink = customerslink;
	}

	public WebElement getPricinglink() {
		return pricinglink;
	}

	public void setPricinglink(WebElement pricinglink) {
		this.pricinglink = pricinglink;
	}

	public WebElement getSignupLink() {
		return signupLink;
	}

	public void setSignupLink(WebElement signupLink) {
		this.signupLink = signupLink;
	}
	
	public WebElement getContactLink() {
		return contactLink;
	}

	public void setContactLink(WebElement contactLink) {
		this.contactLink = contactLink;
	}
	
	public WebElement getFeaturesLink() {
		return FeaturesLink;
	}

	public void setFeaturesLink(WebElement FeaturesLink) {
		this.FeaturesLink = FeaturesLink;}
 
    }
    
   

    
    
