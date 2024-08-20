package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class productPage extends BasePage {


    public productPage(WebDriver driver) {
        super(driver);

    }

    By title = By.xpath("//span[@class='title']");
    String addToCartButton = "//div[text()='%s']/ancestor::div[@class= 'inventory_item']//button";
    By cartButton = By.xpath("//a[@class='shopping_cart_link']");
    By sort = By.xpath("//select[@class = 'product_sort_container']");


    public productPage clickAddToCartButton(String productName) {
        driver.findElement(By.xpath(String.format(addToCartButton, productName))).click();
        return this;

    }

    public CartPage clickCart() {

        driver.findElement(cartButton).click();
        return new CartPage(driver);

    }

    public productPage isPageOpened() {

        driver.findElement(title).isDisplayed();
        return this;

    }


    public productPage selectSort(String sorting) {
        Select select = new Select(driver.findElement(sort));
        select.selectByVisibleText(sorting);
        return this;
    }

}

