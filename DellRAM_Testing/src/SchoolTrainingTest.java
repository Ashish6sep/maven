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
public class SchoolTrainingTest {
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
  public void schoolTraining() throws InterruptedException {
    driver.get("http://dev.dellram.co.in/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).sendKeys("noadmin");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).sendKeys("drupaldellram@admin");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("School Training")).click();
    driver.findElement(By.cssSelector(".glyphicon-plus")).click();
    
    driver.findElement(By.id("edit-submit")).click();
	String expmsg="Title field is required.";
    String msg=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg);
    //Assert.assertTrue(msg.contains(expmsg));
    if(msg.contains(expmsg))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-field-type-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-type-und"));
      dropdown.findElement(By.xpath("//option[. = 'Events']")).click();
    }
    driver.findElement(By.id("edit-field-type-und")).click();
    driver.findElement(By.cssSelector(".form-item-field-type-und > label")).click();
    driver.findElement(By.id("edit-field-type-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-type-und"));
      dropdown.findElement(By.xpath("//option[. = 'School Training']")).click();
    }
    driver.findElement(By.id("edit-field-type-und")).click();
    
    driver.findElement(By.id("edit-submit")).click();
	String expmsg1="Title field is required.";
    String msg1=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg1);
    //Assert.assertTrue(msg1.contains(expmsg1));
    if(msg1.contains(expmsg1))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-title")).click();
    driver.findElement(By.id("edit-title")).sendKeys("ac");
    
    driver.findElement(By.id("edit-submit")).click();
	String expmsg11="Vendor field is required.";
    String msg11=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg11);
    //Assert.assertTrue(msg11.contains(expmsg11));
    if(msg11.contains(expmsg11))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-marcom-vendor-und"));
      dropdown.findElement(By.xpath("//option[. = 'Reed Exhibitions India']")).click();
    }
    driver.findElement(By.id("edit-title")).click();
    
    driver.findElement(By.id("edit-submit")).click();
	String expmsg111="Quarter field is required.";
    String msg111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg111);
    //Assert.assertTrue(msg111.contains(expmsg111));
    if(msg111.contains(expmsg111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-field-marcom-quarter-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-marcom-quarter-und"));
      dropdown.findElement(By.xpath("//option[. = 'Q1FY21']")).click();
    }
    driver.findElement(By.id("edit-field-marcom-quarter-und")).click();
    
    driver.findElement(By.id("edit-submit")).click();
	String expmsg1111="Status field is required.";
    String msg1111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg1111);
    //Assert.assertTrue(msg1111.contains(expmsg1111));
    if(msg1111.contains(expmsg1111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-field-marcom-status-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-marcom-status-und"));
      dropdown.findElement(By.xpath("//option[. = 'Active']")).click();
    }
    driver.findElement(By.id("edit-field-marcom-status-und")).click();
    driver.findElement(By.id("edit-field-marcom-end-date-und-0-value-datepicker-popup-2")).click();
    driver.findElement(By.linkText("23")).click();
    driver.findElement(By.id("edit-field-marcom-campaign-manager-und")).click();
    driver.findElement(By.cssSelector("#field-marcom-end-date-add-more-wrapper .date-no-float")).click();
    
    driver.findElement(By.id("edit-submit")).click();
	String expmsg11111="Manager field is required.";
    String msg11111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg11111);
    //Assert.assertTrue(msg11111.contains(expmsg11111));
    if(msg11111.contains(expmsg11111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-field-marcom-campaign-manager-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-marcom-campaign-manager-und"));
      dropdown.findElement(By.xpath("//option[. = 'vikas']")).click();
    }
    driver.findElement(By.id("edit-field-marcom-campaign-manager-und")).click();
    
    driver.findElement(By.id("edit-submit")).click();
	String expmsg111111="Math question field is required.";
    String msg111111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg111111);
    //Assert.assertTrue(msg111111.contains(expmsg111111));
    if(msg111111.contains(expmsg111111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-captcha-response")).click();
    Thread.sleep(9000);
    //driver.findElement(By.id("edit-captcha-response")).sendKeys("9");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.cssSelector(".form-item-title > label")).click();
    driver.findElement(By.id("edit-title")).click();
    driver.findElement(By.id("edit-title")).sendKeys("acsac");
    driver.findElement(By.id("edit-captcha-response")).click();
    Thread.sleep(9000);
    //driver.findElement(By.id("edit-captcha-response")).sendKeys("15");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("School Training")).click();
    driver.findElement(By.cssSelector(".views-row-first .glyphicon")).click();
    driver.findElement(By.id("edit-captcha-response")).click();
    Thread.sleep(9000);
    //driver.findElement(By.id("edit-captcha-response")).sendKeys("5");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.id("edit-field-marcom-campaign-manager-uid")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-marcom-campaign-manager-uid"));
      dropdown.findElement(By.xpath("//option[. = 'vikas']")).click();
    }
    driver.findElement(By.id("edit-field-marcom-campaign-manager-uid")).click();
    driver.findElement(By.id("edit-submit-admin-school-training")).click();
    driver.findElement(By.linkText("Dashboard")).click();
    driver.findElement(By.linkText("Log out")).click();
  }
}
