package github.meshhi.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import github.meshhi.webdriver.BaseDriver;

public class CartPage {
    public WebDriver driver;
    @FindAll({@FindBy(className = "cart_item")})
    private List<WebElement> cartItems;
    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    public CartPage(BaseDriver baseDriver) {
        PageFactory.initElements(baseDriver.driver, this);
        this.driver = baseDriver.driver;
    }

    public int getCartListLength() {
        return cartItems.size();
    }

    public void goCheckout() {
        checkoutButton.click();
    }
}
