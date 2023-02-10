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
public class ActivitiesTest {
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
  public void activities() {
    driver.get("http://dev.dellram.co.in/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).sendKeys("RAMadmin");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).sendKeys("123456");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.cssSelector(".Master > .caret")).click();
    driver.findElement(By.linkText("Activity/Type")).click();
    driver.findElement(By.linkText("Activity Type")).click();
    driver.findElement(By.id("edit-submit")).click();
    String expmsg111="Name field is required.";
    String msg111=driver.findElement(By.cssSelector("body > div.home_page > div > div > div.col-md-9.home_grid_nine > div > div > section > div")).getText();
    System.out.println(expmsg111);
    //Assert.assertTrue(msg111.contains(expmsg111));
    if(msg111.contains(expmsg111))
    	System.out.println("Test Passed");
    else
    	System.out.println("Test Failed");
    driver.findElement(By.id("edit-field-activity-name")).click();
    driver.findElement(By.id("edit-field-activity-name-und-0-value")).click();
    driver.findElement(By.id("edit-field-activity-name-und-0-value")).sendKeys("activity1");
    driver.findElement(By.id("edit-body-und-0-value")).click();
    driver.findElement(By.id("edit-body-und-0-value")).sendKeys("abcd");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("Master")).click();
    driver.findElement(By.linkText("Activity/Type")).click();
    driver.findElement(By.linkText("Vendor Activities")).click();
    driver.findElement(By.id("edit-field-activity-type-und")).click();
    driver.findElement(By.id("edit-field-act-name-und-0-value")).click();
    driver.findElement(By.id("edit-field-act-name-und-0-value")).sendKeys("ramtest");
    driver.findElement(By.id("edit-field-activity-type-und")).click();
    {
      WebElement dropdown = driver.findElement(By.id("edit-field-activity-type-und"));
      dropdown.findElement(By.xpath("//option[. = 'test']")).click();
    }
    driver.findElement(By.id("edit-field-activity-type-und")).click();
    driver.findElement(By.id("edit-body-und-0-value")).click();
    driver.findElement(By.id("edit-body-und-0-value")).sendKeys("dsvc");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.cssSelector(".Master > .caret")).click();
    driver.findElement(By.linkText("Activity/Type")).click();
    driver.findElement(By.linkText("Activity Type")).click();
    driver.findElement(By.id("edit-cancel")).click();
    driver.findElement(By.linkText("Vendor Activities")).click();
    driver.findElement(By.id("edit-cancel")).click();
    driver.findElement(By.linkText("Dashboard")).click();
    driver.findElement(By.linkText("Log out")).click();
  }
}
