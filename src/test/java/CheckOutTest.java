import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutTest extends BaseTest {

    @Test
    public void test() {

        loginPage.openPage()
                .login("standard_user", "secret_sauce")
                .isPageOpened()
                .clickAddToCartButton("Sauce Labs Bike Light")
                .clickCart()
                .clickCheckOutButton()
                .fieldForm("Ivan","","1244")
                .clickContinue();
        Assert.assertEquals(checkOutPage.getErrorMessage(),"Error: Last Name is required");









    }
}
