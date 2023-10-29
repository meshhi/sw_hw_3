package github.meshhi.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import github.meshhi.webdriver.BaseDriver;

public class CheckoutStepTwoPage {
    public WebDriver driver;
    @FindBy(className ="summary_subtotal_label")
    private WebElement summarySubtotal;
    @FindBy(css =".summary_info_label.summary_total_label")
    private WebElement summaryTotal;
    

    public CheckoutStepTwoPage(BaseDriver baseDriver) {
        PageFactory.initElements(baseDriver.driver, this);
        this.driver = baseDriver.driver;
    }

    public String getSummary() {
        String[] summaryTotalText = summaryTotal.getText().split(" ");
        String summaryTotalPrice = summaryTotalText[1];
        return summaryTotalPrice;
    }
}
