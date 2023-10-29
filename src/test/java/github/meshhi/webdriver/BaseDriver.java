package github.meshhi.webdriver;

import github.meshhi.utils.ConfProperties;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
    public WebDriver driver;

    public BaseDriver() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void goToURL(String url) {
        driver.get(url);
    }

    public void quit() {
        driver.quit();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}
