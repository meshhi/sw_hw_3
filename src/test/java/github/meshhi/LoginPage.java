package github.meshhi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public void setup() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "");
        driver.manage().window().maximize();
        driver.get("https://passport.yandex.ru/auth");
    }
}
