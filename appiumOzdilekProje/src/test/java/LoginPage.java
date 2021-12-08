import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginPage extends BasePage {
    public Logger logger = LogManager.getLogger(getClass());

    @Step("kullanıcı alanına bilgiler girilir")
    public void sendKeys() {

        logger.info("Mail Giriliyor...");
        By email = By.id("com.ozdilek.ozdilekteyim:id/etEposta");
        MobileElement enterEmail = appiumDriver.findElement(email);
        enterEmail.sendKeys("sehinsah");

        logger.info("Şifre Giriliyor...");
        By password = By.id("com.ozdilek.ozdilekteyim:id/etPassword");
        MobileElement enterPassword = appiumDriver.findElement(password);
        enterPassword.sendKeys("saniser");

    }
}
