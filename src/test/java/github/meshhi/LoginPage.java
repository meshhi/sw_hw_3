package github.meshhi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    @FindBy(css = "#user-name")
    private WebElement loginField;
    @FindBy(css = "#password")
    private WebElement passwordField;
    @FindBy(css = "#login-button")
    private WebElement loginButton;
    // 8 locators for purpose of homework 
    @FindBy(id = "user-name")
    private WebElement loginFieldById;
    @FindBy(className = "submit-button")
    private WebElement loginFieldByClassName;
    @FindBy(tagName = "input")
    private WebElement loginButtonByTagName; // incorrect, can`t identify DOM element by tag only
    @FindBy(name = "user-name")
    private WebElement loginButtonByName;
    @FindBy(linkText = "Link-text example") 
    private WebElement loginButtonByLinkText; // incorrect, no links on page
    @FindBy(partialLinkText = "example") 
    private WebElement loginButtonByPartialLinkText; // incorrect, no links on page
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement loginButtonByXPath;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
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
}
