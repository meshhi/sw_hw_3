package github.meshhi.tests;

import org.junit.Test;

import github.meshhi.utils.ConfProperties;

import org.junit.Assert;

public class LoginTest extends BaseTestAuthorizeTemplate {
    @Test
    public void pass() {
        Assert.assertEquals(driver.getCurrentURL(), ConfProperties.getProperty("shoppage"));
    }
}
