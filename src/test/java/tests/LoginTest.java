package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void invalidLoginTest() {

        base.DriverManager.getDriver()
                .get("https://the-internet.herokuapp.com/login");

        LoginPage loginPage = new LoginPage();

        loginPage.login("wrongUser", "wrongPass");

        Assert.assertTrue(
                loginPage.getMessage()
                        .toLowerCase()
                        .contains("your username is invalid"),
                "Expected error message not displayed"
        );
    }
}
