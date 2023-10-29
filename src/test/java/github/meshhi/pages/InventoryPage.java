package github.meshhi.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import github.meshhi.webdriver.BaseDriver;

public class InventoryPage {
    public WebDriver driver;
    @FindAll({@FindBy(xpath="//button[text()='Add to cart']")})
    private List<WebElement> addButtons;
    @FindBy(className ="shopping_cart_container")
    private WebElement cartIcon;

    public InventoryPage(BaseDriver baseDriver) {
        PageFactory.initElements(baseDriver.driver, this);
        this.driver = baseDriver.driver;
    }

    public void addAllItemsToCart() {
        for (WebElement addButton : addButtons) {
            addButton.click();
        }
    }

    public int getItemsLength() {
        return addButtons.size();
    }

    public void goToCart() {
        cartIcon.click();
    }
}
