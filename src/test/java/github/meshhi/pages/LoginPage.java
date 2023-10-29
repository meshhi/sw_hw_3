package github.meshhi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import github.meshhi.webdriver.BaseDriver;
import github.meshhi.utils.Warehouse;

public class LoginPage {
    public WebDriver driver;
    @FindBy(css = "#user-name")
    private WebElement loginField;
    @FindBy(css = "#password")
    private WebElement passwordField;
    @FindBy(css = "#login-button")
    private WebElement loginButton;

    public LoginPage(BaseDriver baseDriver) {
        PageFactory.initElements(baseDriver.driver, this);
        this.driver = baseDriver.driver;
    }

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void authorize() {
        inputLogin(Warehouse.getLogin());
        inputPassword(Warehouse.getPassword());
        clickLoginButton();
    }
}
