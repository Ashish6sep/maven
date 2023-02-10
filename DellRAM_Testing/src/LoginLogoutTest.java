import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.*;

import com.qa.DellRAM.base.TestBase;
public class LoginLogoutTest{
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
  public void LoginLogoutTest() {
		Properties prop = new Properties();
		driver.get("http://dev.dellram.co.in/");
	    driver.manage().window().setSize(new Dimension(1366, 728));
	    
	//TC-LOG-002     
	driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).sendKeys("noadmin");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).sendKeys("drupaldellram@admin");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("Campaigns")).click();
    driver.findElement(By.linkText("Events")).click();
    driver.findElement(By.linkText("Events")).click();
    driver.findElement(By.linkText("School Training")).click();
    driver.findElement(By.linkText("Queries")).click();
    driver.findElement(By.linkText("Mails")).click();
    driver.findElement(By.linkText("Campaigns")).click();
    driver.findElement(By.linkText("Dashboard")).click();
    //TC-LOG-009
    driver.findElement(By.linkText("Log out")).click();
    
    //TC-LOG-001
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).sendKeys("noadmin");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).sendKeys("drupaldellram");
    driver.findElement(By.id("edit-submit")).click();
    String expmsg="Sorry, unrecognized username or password. Have you forgotten your password?";
    String msg=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section/div[1]")).getText();
    //Assert.assertTrue(msg.contains(expmsg));
    if(msg.contains(expmsg))
    	System.out.println("Match Found");
    else
    	System.out.println("Match not Found");
    
    //TC-LOG-001
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).sendKeys(" ");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).sendKeys(" ");
    driver.findElement(By.id("edit-submit")).click();
    String expmsg1="Sorry, unrecognized username or password. Have you forgotten your password?";
    String msg1=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section/div[1]")).getText();
   // Assert.assertTrue(msg1.contains(expmsg1));
    if(msg1.contains(expmsg1))
    	System.out.println("Match Found");
    else
    	System.out.println("Match not Found");
  }
  
 
}