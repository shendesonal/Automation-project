package Basepack;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilpack.UtilityClass;

public class BaseClass {
	 public static WebDriver driver;
		public static Properties prop;
		
		
		
		public BaseClass() throws IOException {
	     prop=new Properties();     
	     String path="C:\\Users\\sonal\\eclipse-workspace\\FreeCrmAplication\\src\\main\\java\\ConfigPackage\\Config.properties";
	     FileInputStream fis =new FileInputStream(path);
	     prop.load(fis);
		}
		
		public static void initilization() {
			
			String BrowserName=prop.getProperty("Browser");
			
			if (BrowserName.equalsIgnoreCase("chrome")) 
			{
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sonal\\eclipse-workspace\\FreeCrmAplication\\drivers\\chromedriver.exe");
				
				
				driver=new ChromeDriver();
				}
			
			 
			else if(BrowserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\sonal\\eclipse-workspace\\FreeCrmAplication\\drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(UtilityClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(UtilityClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
	
	
	
	
	//*public static WebDriver openChromeBrower() {
			//System.setProperty("webdriver.chrome.driver","\"C:\\Users\\sonal\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe\"");
	      //WebDriverManager.chromedriver().setup();
			//WebDriver driver = new ChromeDriver();
	        //return driver ;
	        }
			
	       // public static WebDriver openFirefoxBrower() {
			//System.setProperty("webdriver.chrome.driver","\"C:\\Users\\sonal\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe\"");
		     //WebDriver driver = new FirefoxDriver();
		       // return driver ;
		       // );
    		
			
	}
	
