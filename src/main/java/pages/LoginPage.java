package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {




    By userNameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButtonField = By.id("login-button");
    By errorMessage = By.xpath("//h3[@data-test = 'error'");



    public LoginPage(WebDriver driver) {
        super(driver);

    }


public LoginPage openPage() {
driver. get("https://www.saucedemo.com/");
return this;
    }

    public productPage login(String username, String password) {

        driver.findElement(userNameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButtonField).click();
        return new productPage(driver);
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();

    }


}
