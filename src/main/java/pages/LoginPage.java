package pages;

import base.DriverManager;
import org.openqa.selenium.By;

public class LoginPage {

    private final By username = By.id("username");
    private final By password = By.id("password");
    private final By loginButton = By.cssSelector("button[type='submit']");
    private final By message = By.id("flash");

    public void login(String user, String pass) {
        DriverManager.getDriver().findElement(username).sendKeys(user);
        DriverManager.getDriver().findElement(password).sendKeys(pass);
        DriverManager.getDriver().findElement(loginButton).click();
    }

    public String getMessage() {
        return DriverManager.getDriver().findElement(message).getText();
    }
}
