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
public class CampaignTest {
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
  public void campaign() throws InterruptedException {
    driver.get("http://dev.dellram.co.in/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).sendKeys("noadmin");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).sendKeys("drupaldellram@admin");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("Master")).click();
    driver.findElement(By.linkText("Master")).click();
    driver.findElement(By.linkText("Campaigns")).click();
    driver.findElement(By.cssSelector(".glyphicon-plus")).click();
    driver.findElement(By.id("edit-submit")).click();
    String expmsg="Name field is required.";
    String msg=driver.findElement(By.cssSelector("#console > div")).getText();
    System.out.println(expmsg);
    //Assert.assertTrue(msg.contains(expmsg));
    if(msg.contains(expmsg))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    
    driver.findElement(By.id("edit-field-campaign-type-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-campaign-type-und"));
      dropdown.findElement(By.xpath("//option[. = 'Glow Signboard']")).click();
    }
    driver.findElement(By.id("edit-field-campaign-type-und")).click();
    driver.findElement(By.id("edit-field-name-und-0-value")).click();
    driver.findElement(By.id("edit-field-name-und-0-value")).sendKeys("DSEF");
    driver.findElement(By.id("edit-field-financial-quarter-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-financial-quarter-und"));
      dropdown.findElement(By.xpath("//option[. = 'Q2-2019']")).click();
    }
    driver.findElement(By.id("edit-field-financial-quarter-und")).click();
    driver.findElement(By.id("edit-field-budget-und-0-value")).click();
    driver.findElement(By.id("edit-field-budget-und-0-value")).sendKeys("3345");
    WebElement fileInput = driver.findElement(By.id("edit-field-campaign-documents-und-0-upload"));
	//fileInput.sendKeys(filepath);

	// Added a wait to make you notice the difference.
	Thread.sleep(1000);

	driver.findElement(By.id("edit-field-campaign-documents-und-0-upload")).sendKeys("C:\\Users\\baryons\\Desktop\\vendortestdoc.txt");
	driver.findElement(By.name("field_campaign_documents_und_0_upload_button")).click();
	// Added sleep to make you see the difference.
	Thread.sleep(1000);
	//fileInput.sendKeys(filepath);
    driver.findElement(By.id("edit-captcha-response")).click();
    Thread.sleep(9000);
    //driver.findElement(By.id("edit-captcha-response")).sendKeys("8");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.id("edit-captcha-response")).click();
    Thread.sleep(9000);
    //driver.findElement(By.id("edit-captcha-response")).sendKeys("6");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("Log out")).click();
  }
}
