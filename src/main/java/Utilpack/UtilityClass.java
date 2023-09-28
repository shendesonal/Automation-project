	package Utilpack;
	
	
	import java.io.FileInputStream;
	import java.io.IOException;
	
	import org.apache.poi.sl.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	
	import Basepack.BaseClass;
	
	    public class UtilityClass extends BaseClass{
		static Workbook book;
	
		public UtilityClass() throws IOException {
				
				}
	
		public static long PAGE_LOAD_TIMEOUT = 50;
		public static long IMPLICIT_WAIT = 50;
			
		public void frame(String frame) {
		driver.switchTo().frame(frame);}
				
				
	    public static String featchDatafromExcelSheet(String sheet,int row,int coloum) throws  IOException
					{
						String data;
						String path="\"C:\\Users\\sonal\\OneDrive\\Desktop\\Test.xlsx\"";
						FileInputStream file=new FileInputStream(path);
						data=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(coloum).getStringCellValue();
						try
						{
						   data=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(coloum).getStringCellValue();
							
						}
						catch(IllegalStateException e)
						{
						    double value=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(coloum).getNumericCellValue();
							data=Double.toString(value);
						}
						return data;
						
					}
					/*public static void captureScreenShot(WebDriver driver,int testId) throws IOException
					{
						DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM-dd-yyyy HH-mm-ss");
						LocalDateTime dateAndtime= LocalDateTime.now();
						String datetime =dtf.format(dateAndtime);	
						TakesScreenshot take= (TakesScreenshot) driver;
						File srce= take.getScreenshotAs(OutputType.FILE);
		File dest =new File("D:\\Sotware tesing\\ScreenShot\\Test"+ testId+" "+datetime+".png");
						FileHandler.copy(srce, dest);*/
	
			
		}
	
	
