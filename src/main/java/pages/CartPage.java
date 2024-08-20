package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CartPage extends BasePage {


    public CartPage(WebDriver driver) {
        super(driver);

    }

    By checkOutButton = By.id("checkout");
    By removeButton = By.id("remove-sauce-labs-onesie");
    By menuButton = By.id("react-burger-menu-btn");
    By logoutButton = By.id("logout_sidebar_link");


    public CheckOutPage clickCheckOutButton() {
        driver.findElement(checkOutButton).click();
        return new CheckOutPage(driver);
    }


    public CartPage clickRemoveButton() {
        driver.findElement(removeButton).click();
        return this;
    }

public CartPage clickMenuButton() {
        driver.findElement(menuButton).click();
        return this;
            }
public CartPage clickLogoutButton() {
        driver.findElement(logoutButton).click();
        return new CartPage(driver);
}

}