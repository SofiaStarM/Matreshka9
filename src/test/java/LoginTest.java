import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {



   @Test
    public void test()  {

      loginPage.openPage();
      loginPage.login("standard_user", "secret_sauce");
      Assert.assertTrue(driver.findElement(By.className("title")).isDisplayed());



}

   @Test
   public void test2()  {

      driver. get("https://www.saucedemo.com/");
      driver.findElement(By.id("user-name")).sendKeys("111");
      driver.findElement(By.id("password")).sendKeys("secret_sauce");
      driver.findElement(By.id("login-button")).click();
      driver.findElement(By.xpath("//h3[@data-test = 'error' ]")).getText();
      Assert.assertEquals(driver.findElement(By.xpath("//h3[@data-test = 'error' ]")).getText(),
              "Epic sadface: Username and password do not match any user in this service");
   }
}