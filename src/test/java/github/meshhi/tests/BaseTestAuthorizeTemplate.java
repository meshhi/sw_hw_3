package github.meshhi.tests;

import org.junit.After;
import org.junit.Before;

import github.meshhi.pages.LoginPage;
import github.meshhi.webdriver.BaseDriver;
import github.meshhi.utils.ConfProperties;

public class BaseTestAuthorizeTemplate {
    public BaseDriver driver;

    @Before
    public void setup() throws InterruptedException {
        driver = new BaseDriver();
        authorize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public void authorize() throws InterruptedException {
        driver.goToURL(ConfProperties.getProperty("loginpage"));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorize();
    }
}