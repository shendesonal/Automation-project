package PomPack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basepack.BaseClass;

public class HomePage extends BaseClass{
	

	 
		
		@FindBy (xpath = "//a[contains(text(),'Home')]")
	    private WebElement Home ;
		
		@FindBy (xpath = "//a[contains(text(),'Calendar')]")
	    private WebElement Calendar ;
		
		@FindBy (xpath = "//a[contains(text(),'Companies')]")
	    private WebElement Companies ;
		
		@FindBy (xpath = "//a[contains(text(),'Contacts')]")
	    private WebElement Contacts ;
		
		@FindBy (xpath = "//a[contains(text(),'Deals')]")
	    private WebElement Deals ;
		
		@FindBy (xpath = "//a[contains(text(),'Tasks')]")
	    private WebElement Tasks ;
		
		@FindBy (xpath = "//a[contains(text(),'Cases')]")
	    private WebElement Cases ;
		
		@FindBy (xpath = "//a[contains(text(),'Call')]")
	    private WebElement Call ;
		
		@FindBy (xpath = "//a[contains(text(),'Email')]")
	    private WebElement Email ;

		@FindBy (xpath = "//a[contains(text(),'Text/SMS')]")
	    private WebElement TextSMS ;

		@FindBy (xpath = "//a[contains(text(),'Print')]")
	    private WebElement Print ;

		@FindBy (xpath = "//a[contains(text(),'Campaigns')]")
	    private WebElement Campaigns ;

		@FindBy (xpath = "//a[contains(text(),'Docs')]")
	    private WebElement Docs ;

		@FindBy (xpath = "//a[contains(text(),'Forms')]")
	    private WebElement Forms ;

		@FindBy (xpath = "//a[contains(text(),'Reports')]")
	    private WebElement Reports ;
		
		public HomePage() throws IOException{
		    PageFactory.initElements(driver, this); //object of current class
		    }
		public void clickonhome() {
			Home .click();
	    }
		public void clickonCalendar() {
			Calendar .click();
	    }
		public void clickonCompanies() {
			Companies  .click();
	    }
		public void clickonContacts() {
			Contacts .click();
	    }
		public void clickonDeals() {
			Deals .click();
	    }
		public void clickonTasks() {
			Tasks .click();
	    }
		public void clickonCases () {
			Cases  .click();
	    }
		public void clickonCall() {
			Call .click();
	    }
		public void clickonEmail() {
			Email .click();
	    }
		public void clickonTextSMS() {
			TextSMS .click();
	    }
		public void clickonPrint() {
			Print .click();
	    }
		public void clickonCampaigns() {
			Campaigns .click();
	    }
		public void clickonDocs() {
			Docs.click();
	    }
		public void clickonForms () {
			Forms .click();
	    }
		
		public void clickonReports() {
			Reports .click();
	    }
		public void homepageelement () {
			Home .click();
			Calendar .click();
			Companies  .click();
			Contacts .click();
			Deals .click();
			Cases  .click();
			Email .click();
			TextSMS .click();
			Print .click();
			Campaigns .click();
			Docs.click();
			Forms .click();
			Reports .click();
	    }

}
 

	


