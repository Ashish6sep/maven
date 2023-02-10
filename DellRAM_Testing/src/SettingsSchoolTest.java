import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SettingsSchoolTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeMethod
@BeforeClass
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterMethod
@AfterClass
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void settingsSchool() {
    driver.get("http://dev.dellram.co.in/");
    driver.manage().window().setSize(new Dimension(1366, 728));
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-name")).sendKeys("noadmin");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).sendKeys("drupaldellram@admin");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("Settings")).click();
    driver.findElement(By.linkText("School Import")).click();
    driver.findElement(By.id("sch_button_temp")).click();
    class ReadExcel {
    	public void main (String [] args) throws IOException{
                
    		driver.findElement(By.cssSelector(".btnSubmit")).click();
    		String expmsg="Please upload the correct template file format";
    	    String msg=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section/div[1]")).getText();
    	    System.out.println(expmsg);
    	    //Assert.assertTrue(msg.contains(expmsg));
    	    if(msg.contains(expmsg))
    	    	System.out.println("Test Passed");
    	    else
    	    	System.out.println("Test Failed"); 
    	    
    			FileInputStream fis = new FileInputStream("C:\\Users\\baryons\\Downloads\\store_upload_template (1).csv");
    			XSSFWorkbook workbook = new XSSFWorkbook(fis);
    			XSSFSheet sheet = workbook.getSheetAt(0);
    			XSSFRow row = sheet.getRow(0);
    			XSSFCell cell = row.getCell(0);
                System.out.println(cell);
    			System.out.println(sheet.getRow(0).getCell(0));
    			//String cellval = cell.getStringCellValue();
    			//System.out.println(cellval);
    			
    	}
    }
    //driver.findElement(By.id("fileSelect")).click();
    //driver.findElement(By.id("fileSelect")).sendKeys("C:\\fakepath\\school_upload_template.csv");
    driver.findElement(By.cssSelector(".btnSubmit")).click();
    driver.findElement(By.linkText("Dashboard")).click();
    driver.findElement(By.linkText("Log out")).click();
  }
}
