package github.meshhi.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Before;

import github.meshhi.pages.LoginPage;
import github.meshhi.webdriver.BaseDriver;

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
        driver.goToURL("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorize();
    }
}