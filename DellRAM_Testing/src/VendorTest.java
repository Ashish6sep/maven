import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class VendorTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
private CharSequence filepath;
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
  public void vendor() throws InterruptedException {
    driver.get("http://dev.dellram.co.in/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).sendKeys("noadmin");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).sendKeys("drupaldellram@admin");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.cssSelector(".Master > .caret")).click();
    driver.findElement(By.linkText("Vendors")).click();
    //TC-USR-009,TC-USR-010
    driver.findElement(By.linkText("Add Vendor")).click();
    //TC-USR-011
    driver.findElement(By.id("edit-submit")).click();
    String expmsg111="Name field is required.";
    String msg111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg111);
    //Assert.assertTrue(msg111.contains(expmsg111));
    if(msg111.contains(expmsg111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    driver.findElement(By.id("edit-field-name1-und-0-value")).click();
    driver.findElement(By.id("edit-field-name1-und-0-value")).sendKeys("test123");
    
    String expmsg1111="Name field is required.";
    String msg1111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg1111);
    //Assert.assertTrue(msg1111.contains(expmsg1111));
    if(msg1111.contains(expmsg1111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    driver.findElement(By.id("edit-submit")).click();
    
    driver.findElement(By.id("edit-field-vedor-description-und-0-value")).click();
    driver.findElement(By.id("edit-field-vedor-description-und-0-value")).sendKeys("ascd");
    driver.findElement(By.id("edit-field-vendor-street-address-und-0-value")).click();
    driver.findElement(By.id("edit-field-vendor-street-address-und-0-value")).sendKeys("cxc");
    driver.findElement(By.id("edit-field-vendor-region-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-vendor-region-und"));
      dropdown.findElement(By.xpath("//option[. = 'South']")).click();
    }
    driver.findElement(By.id("edit-field-vendor-region-und")).click();
    driver.findElement(By.id("edit-field-state-und")).click();
    driver.findElement(By.id("edit-field-state-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-state-und"));
      dropdown.findElement(By.xpath("//option[. = 'Karnataka']")).click();
    }
    driver.findElement(By.id("edit-field-state-und")).click();
    driver.findElement(By.id("edit-field-city-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-city-und"));
      dropdown.findElement(By.xpath("//option[. = 'Bangalore']")).click();
    }
    driver.findElement(By.id("edit-field-city-und")).click();
    driver.findElement(By.id("edit-field-phone-no-und-0-value")).click();
    driver.findElement(By.id("edit-field-phone-no-und-0-value")).sendKeys("2222222222");
    driver.findElement(By.cssSelector(".form-item-field-vendor-status-und > label")).click();
    driver.findElement(By.id("edit-field-vendor-status-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-vendor-status-und"));
      dropdown.findElement(By.xpath("//option[. = 'Active']")).click();
    }
    driver.findElement(By.id("edit-field-vendor-status-und")).click();
    WebElement fileInput = driver.findElement(By.id("edit-field-reports-und-0-upload"));
	//fileInput.sendKeys(filepath);

	// Added a wait to make you notice the difference.
	Thread.sleep(1000);

	driver.findElement(By.id("edit-field-reports-und-0-upload")).sendKeys("C:\\Users\\baryons\\Desktop\\vendortestdoc.txt");
	driver.findElement(By.name("field_reports_und_0_upload_button")).click();
	// Added sleep to make you see the difference.
	Thread.sleep(1000);
	//fileInput.sendKeys(filepath);
	driver.findElement(By.id("edit-submit")).click();
	String expmsg11111="Math question field is required.";
    String msg11111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg11111);
    //Assert.assertTrue(msg11111.contains(expmsg11111));
    if(msg11111.contains(expmsg11111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
   
    
    driver.findElement(By.id("edit-captcha-response")).click();
    Thread.sleep(9000);
    //driver.findElement(By.id("edit-captcha-response")).sendKeys("19");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("×")).click();
    driver.findElement(By.cssSelector(".Master > .caret")).click();
    driver.findElement(By.linkText("Vendors")).click();
    driver.findElement(By.linkText("test123")).click();
    driver.findElement(By.linkText("Dashboard")).click();
    driver.findElement(By.linkText("Log out")).click();
  }
}
