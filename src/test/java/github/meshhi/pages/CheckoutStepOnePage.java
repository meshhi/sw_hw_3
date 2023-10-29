package github.meshhi.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import github.meshhi.webdriver.BaseDriver;
import github.meshhi.utils.Warehouse;

public class CheckoutStepOnePage {
    public WebDriver driver;
    @FindBy(id ="first-name")
    private WebElement firstName;
    @FindBy(id ="last-name")
    private WebElement lastName;
    @FindBy(id ="postal-code")
    private WebElement postalCode;
    @FindBy(id ="continue")
    private WebElement continueButton;

    public CheckoutStepOnePage(BaseDriver baseDriver) {
        PageFactory.initElements(baseDriver.driver, this);
        this.driver = baseDriver.driver;
    }

    public void fillForm() {
        firstName.sendKeys(Warehouse.getFirstName());
        lastName.sendKeys(Warehouse.getLastName());
        postalCode.sendKeys(Warehouse.getPostalCode());
    }

    public void goNext() {
        continueButton.click();
    }
}
