package github.meshhi.tests;

import org.junit.Test;

import java.io.EOFException;

import org.junit.Assert;
import github.meshhi.pages.InventoryPage;
import github.meshhi.pages.CheckoutStepOnePage;
import github.meshhi.pages.CheckoutStepTwoPage;
import github.meshhi.pages.CartPage;

public class InventoryTest extends BaseTestAuthorizeTemplate {
    private int itemsInCartCount;
    private int addedItemsCount;
    private InventoryPage inventoryPage;
    private CartPage cartPage;
    private CheckoutStepOnePage checkoutStepOnePage;
    private CheckoutStepTwoPage checkoutStepTwoPage;
    @Test
    public void addAllItems() {
        inventoryPage = new InventoryPage(driver);
        addedItemsCount = inventoryPage.getItemsLength();
        inventoryPage.addAllItemsToCart();
        inventoryPage.goToCart();
        if (driver.getCurrentURL().endsWith("cart.html")) {
            cartPage = new CartPage(driver);
            itemsInCartCount = cartPage.getCartListLength();
        } else {
            itemsInCartCount = 0;
        }
        Assert.assertEquals(addedItemsCount, itemsInCartCount);
    }

    @Test
    public void checkout() throws EOFException {
        addAllItems();
        cartPage.goCheckout();
        if (driver.getCurrentURL().endsWith("checkout-step-one.html")) {
            checkoutStepOnePage = new CheckoutStepOnePage(driver);
            checkoutStepOnePage.fillForm();
            checkoutStepOnePage.goNext();
        } else {
            throw new EOFException();
        }
        if (driver.getCurrentURL().endsWith("checkout-step-two.html")) {
            checkoutStepTwoPage = new CheckoutStepTwoPage(driver);
            String checkoutStepTwoPageText = checkoutStepTwoPage.getSummary();
            Assert.assertEquals("$140.34", checkoutStepTwoPageText);
        } else {
            throw new EOFException();
        }
    }
}
