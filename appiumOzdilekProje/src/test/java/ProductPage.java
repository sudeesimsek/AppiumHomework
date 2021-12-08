import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static io.appium.java_client.touch.offset.PointOption.point;

public class ProductPage extends BasePage {
    public Logger logger = LogManager.getLogger(getClass());

    @Step("aşağıya doğru iki kez scroll edilir")
    public void scrollDown() {

        logger.info("Scroll ediliyor...");
        TouchAction ts = new TouchAction(appiumDriver);
        ts.press(point(530, 1950)).moveTo(point(500, 30)).release().perform();
    }

    public List<MobileElement> randomList() {
        return appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']"));
    }

    @Step("random ürün seçilir")
    public void randomClick() throws InterruptedException {
        logger.info("Random Ürün Seçiliyor...");
        Random random = new Random();
        randomList().get(random.nextInt(randomList().size())).click();
        Thread.sleep(3000);
    }
}
