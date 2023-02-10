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
public class EventsTest {
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
  public void events() throws InterruptedException {
    driver.get("http://dev.dellram.co.in/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).sendKeys("noadmin");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).sendKeys("drupaldellram@admin");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("Events")).click();
    driver.findElement(By.linkText("Add")).click();
    
    driver.findElement(By.id("edit-submit")).click();
    String expmsg111="Type field is required.";
    String msg111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg111);
    //Assert.assertTrue(msg111.contains(expmsg111));
    if(msg111.contains(expmsg111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-field-type-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-type-und"));
      dropdown.findElement(By.xpath("//option[. = 'Events']")).click();
    }
    driver.findElement(By.id("edit-field-type-und")).click();
    
    driver.findElement(By.id("edit-submit")).click();
    String expmsg1111="Title field is required.";
    String msg1111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg1111);
    //Assert.assertTrue(msg1111.contains(expmsg1111));
    if(msg1111.contains(expmsg1111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-title")).click();
    driver.findElement(By.id("edit-title")).sendKeys("Replicate of humanities  test 2 ");
    
    driver.findElement(By.id("edit-submit")).click();
    String expmsg11111="Vendor field is required.";
    String msg11111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg11111);
    //Assert.assertTrue(msg11111.contains(expmsg11111));
    if(msg11111.contains(expmsg11111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-marcom-vendor-und"));
      dropdown.findElement(By.xpath("//option[. = 'Autostriping India Pvt Ltd']")).click();
    }
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-marcom-vendor-und"));
      dropdown.findElement(By.xpath("//option[. = 'Autostriping India Pvt Ltd']")).click();
    }
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-marcom-vendor-und"));
      dropdown.findElement(By.xpath("//option[. = 'Fave Marketing Solutions']")).click();
    }
    driver.findElement(By.id("edit-field-marcom-quarter-und")).click();
    
    driver.findElement(By.id("edit-submit")).click();
    String expmsg111111="Quarter field is required.";
    String msg111111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg111111);
    //Assert.assertTrue(msg111111.contains(expmsg111111));
    if(msg111111.contains(expmsg111111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-marcom-quarter-und"));
      dropdown.findElement(By.xpath("//option[. = 'Q1FY21']")).click();
    }
    driver.findElement(By.id("edit-field-marcom-quarter-und")).click();
    driver.findElement(By.cssSelector(".form-item-field-marcom-description-und-0-value > label")).click();
    
    driver.findElement(By.id("edit-submit")).click();
    String expmsg1111111="Status field is required.";
    String msg1111111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg1111111);
    //Assert.assertTrue(msg1111111.contains(expmsg1111111));
    if(msg1111111.contains(expmsg1111111))
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
    
    driver.findElement(By.id("edit-submit")).click();
    String expmsg11111111="Manager field is required.";
    String msg11111111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg11111111);
    //Assert.assertTrue(msg11111111.contains(expmsg11111111));
    if(msg11111111.contains(expmsg11111111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    
    driver.findElement(By.id("edit-field-marcom-campaign-manager-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-marcom-campaign-manager-und"));
      dropdown.findElement(By.xpath("//option[. = 'baryons123']")).click();
    }
    driver.findElement(By.id("edit-field-marcom-campaign-manager-und")).click();
    
    driver.findElement(By.id("edit-submit")).click();
    String expmsg111111111="Math question field is required.";
    String msg111111111=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg111111111);
    //Assert.assertTrue(msg111111111.contains(expmsg111111111));
    if(msg111111111.contains(expmsg111111111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-captcha-response")).click();
    Thread.sleep(9000);
    //driver.findElement(By.id("edit-captcha-response")).sendKeys("7");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("edit-title")).click();
    driver.findElement(By.id("edit-title")).sendKeys("Replicate of humanities  test 2  sda");
    driver.findElement(By.id("edit-captcha-response")).click();
    Thread.sleep(9000);
    //driver.findElement(By.id("edit-captcha-response")).sendKeys("1");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("Events")).click();
    driver.findElement(By.linkText("Log out")).click();
  }
}
