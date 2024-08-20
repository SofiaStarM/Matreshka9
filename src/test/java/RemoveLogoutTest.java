import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



    public class RemoveLogoutTest extends BaseTest {

        @Test
        public void test() {

            loginPage.openPage()
                    .login("standard_user", "secret_sauce")
                    .isPageOpened()
                    .selectSort("Price (low to high)")
                    .clickAddToCartButton("Sauce Labs Onesie")
                    .clickCart()
                    .clickRemoveButton()
                    .clickMenuButton()
                    .clickLogoutButton();}
        }






