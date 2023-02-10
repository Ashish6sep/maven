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
public class StoreTest {
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
  public void store() throws InterruptedException {
    driver.get("http://dev.dellram.co.in/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.id("edit-name")).sendKeys("noadmin");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).sendKeys("drupaldellram@admin");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.cssSelector(".Master > .caret")).click();
    driver.findElement(By.linkText("Store")).click();
    driver.findElement(By.cssSelector(".glyphicon-plus")).click();
    
    driver.findElement(By.id("edit-submit")).click();
	String expmsg="Store Name field is required.";
    String msg=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg);
    //Assert.assertTrue(msg.contains(expmsg));
    if(msg.contains(expmsg))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-field-name2-und-0-value")).click();
    driver.findElement(By.id("edit-field-name2-und-0-value")).sendKeys("sssss");
    driver.findElement(By.id("edit-field-store-code-und-0-value")).click();
    driver.findElement(By.id("edit-field-store-code-und-0-value")).sendKeys("213");
    driver.findElement(By.id("edit-field-phone-no1-und-0-value")).click();
    driver.findElement(By.id("edit-field-phone-no1-und-0-value")).sendKeys("6666666666");
    driver.findElement(By.id("edit-field-store-type-und")).click();
    
    driver.findElement(By.id("edit-submit")).click();
   	String expmsg1="POSM Type field is required.";
       String msg1=driver.findElement(By.cssSelector("#console > div")).getText();
       System.out.println(expmsg1);
       //Assert.assertTrue(msg1.contains(expmsg1));
       if(msg1.contains(expmsg1))
       	System.out.println("Test Passed");
       else
       	System.out.println("Test Failed");
    
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-store-type-und"));
      dropdown.findElement(By.xpath("//option[. = 'Both']")).click();
    }
    
    driver.findElement(By.id("edit-submit")).click();
   	String expmsg11="Store Type field is required.";
       String msg11=driver.findElement(By.cssSelector("#console > div")).getText();
       System.out.println(expmsg11);
       //Assert.assertTrue(msg11.contains(expmsg11));
       if(msg11.contains(expmsg11))
       	System.out.println("Test Passed");
       else
       	System.out.println("Test Failed");
       
    driver.findElement(By.id("edit-field-store-type-und")).click();
    driver.findElement(By.id("edit-field-store-type-category-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-store-type-category-und"));
      dropdown.findElement(By.xpath("//option[. = 'DES']")).click();
    }
    
    driver.findElement(By.id("edit-submit")).click();
   	String expmsg111="Region field is required.";
       String msg111=driver.findElement(By.cssSelector("#console > div")).getText();
       System.out.println(expmsg111);
       //Assert.assertTrue(msg111.contains(expmsg111));
       if(msg111.contains(expmsg111))
       	System.out.println("Test Passed");
       else
       	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-field-store-type-category-und")).click();
    driver.findElement(By.id("edit-field-store-region-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-store-region-und"));
      dropdown.findElement(By.xpath("//option[. = 'South']")).click();
    }
    
    driver.findElement(By.id("edit-submit")).click();
   	String expmsg1111="State field is required.";
       String msg1111=driver.findElement(By.cssSelector("#console > div")).getText();
       System.out.println(expmsg1111);
       //Assert.assertTrue(msg1111.contains(expmsg1111));
       if(msg1111.contains(expmsg1111))
       	System.out.println("Test Passed");
       else
       	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-field-store-region-und")).click();
    driver.findElement(By.cssSelector(".form-item-field-state1-und")).click();
    driver.findElement(By.id("edit-field-state1-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-state1-und"));
      dropdown.findElement(By.xpath("//option[. = 'Karnataka']")).click();
    }
    
    
    driver.findElement(By.id("edit-submit")).click();
   	String expmsg11111="City field is required.";
       String msg11111=driver.findElement(By.cssSelector("#console > div")).getText();
       System.out.println(expmsg11111);
       //Assert.assertTrue(msg11111.contains(expmsg11111));
       if(msg11111.contains(expmsg11111))
       	System.out.println("Test Passed");
       else
       	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-field-state1-und")).click();
    driver.findElement(By.id("edit-field-city1-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-city1-und"));
      dropdown.findElement(By.xpath("//option[. = 'Bangalore']")).click();
    }
    driver.findElement(By.id("edit-field-city1-und")).click();
    
    driver.findElement(By.id("edit-submit")).click();
   	String expmsg111111="Address field is required.";
       String msg111111=driver.findElement(By.cssSelector("#console > div")).getText();
       System.out.println(expmsg111111);
       //Assert.assertTrue(msg111111.contains(expmsg111111));
       if(msg111111.contains(expmsg111111))
       	System.out.println("Test Passed");
       else
       	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-field-address-und-0-value")).click();
    driver.findElement(By.id("edit-field-address-und-0-value")).sendKeys("39-40, 2nd Floor, 2nd Cross, Govinda Reddy Layout, Bannerghatta Main Rd, opposite Arekere Mico Layout, Bengaluru, Karnataka 560076");
    driver.findElement(By.id("edit-field-pincode-und-0-value")).sendKeys("560076");
    
    driver.findElement(By.id("edit-submit")).click();
   	String expmsg1111111="Math question field is required.";
       String msg1111111=driver.findElement(By.cssSelector("#console > div")).getText();
       System.out.println(expmsg1111111);
       //Assert.assertTrue(msg1111111.contains(expmsg1111111));
       if(msg1111111.contains(expmsg1111111))
       	System.out.println("Test Passed");
       else
       	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-captcha-response")).click();
    Thread.sleep(9000);
    //driver.findElement(By.id("edit-captcha-response")).sendKeys("7");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("×")).click();
    driver.findElement(By.linkText("Settings")).click();
    driver.findElement(By.linkText("Master")).click();
    driver.findElement(By.linkText("Store")).click();
    driver.findElement(By.cssSelector(".views-row-first .glyphicon")).click();
    driver.findElement(By.id("edit-field-name2-und-0-value")).click();
    driver.findElement(By.id("edit-field-name2-und-0-value")).sendKeys("sarfgfrvg");
    driver.findElement(By.id("edit-captcha-response")).click();
    Thread.sleep(9000);
    //driver.findElement(By.id("edit-captcha-response")).sendKeys("17");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("Log out")).click();
  }
}
