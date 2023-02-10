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
public class UserTest {
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
  public void user() {
    driver.get("http://dev.dellram.co.in/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.id("edit-name")).sendKeys("noadmin");
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).sendKeys("drupaldellram@admin");
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.linkText("Master")).click();
    //TC-USR-001
    driver.findElement(By.linkText("Users & Roles")).click();
    //TC-USR-002
    driver.findElement(By.linkText("Add User")).click();
    driver.findElement(By.cssSelector(".edit-action > .btn")).click();
    String expmsg1="Please enter Name";
    String msg1=driver.findElement(By.xpath("//*[@id=\"user-creation-form\"]/div[2]/div/label")).getText();
    //Assert.assertTrue(msg1.contains(expmsg1), "Your error message");
    if(msg1.contains(expmsg1))
    	System.out.println("Match Found");
    else
    	System.out.println("Match not Found");
 
    //TC-USR-003
    driver.findElement(By.id("name_u")).click();
    driver.findElement(By.id("name_u")).sendKeys("tester");
    driver.findElement(By.id("usernae_name")).click();
    driver.findElement(By.id("usernae_name")).sendKeys("abc");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("rohith");
    driver.findElement(By.cssSelector(".edit-action > .btn")).click();
    String expmsg11="Please enter a valid email address.";
    String msg11=driver.findElement(By.xpath("//*[@id=\"user-creation-form\"]/div[4]/div/label")).getText();
    Assert.assertTrue(msg11.contains(expmsg11), "Your error message");
    if(msg11.contains(expmsg11))
    	System.out.println("Match Found");
    else
    	System.out.println("Match not Found");
    
    driver.findElement(By.id("email")).sendKeys("rohith.a136@gmail.com");
    driver.findElement(By.cssSelector(".main-con")).click();
    driver.findElement(By.id("type")).click();
    {
      WebElement dropdown = driver.findElement(By.id("type"));
      dropdown.findElement(By.xpath("//option[. = 'Marcom']")).click();
    }
    driver.findElement(By.id("type")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("admin@123");
    driver.findElement(By.name("conf_password")).click();
    driver.findElement(By.name("conf_password")).sendKeys("admin@123");
    driver.findElement(By.cssSelector(".edit-action > .btn")).click();
    //TC-USR-004,TC-USR-005
    String expmsg111="User is Created.Login Information has been sent through mail.";
    String msg111=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section/div[1]")).getText();
    Assert.assertTrue(msg111.contains(expmsg111), "Your error message");
    if(msg111.contains(expmsg111))
    	System.out.println("Match Found");
    else
    	System.out.println("Match not Found");
    driver.findElement(By.linkText("×")).click();
    driver.findElement(By.linkText("Master")).click();
    driver.findElement(By.linkText("Users & Roles")).click();
    driver.findElement(By.linkText("Log out")).click();
  }
}
