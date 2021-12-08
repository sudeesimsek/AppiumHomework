import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BasePage extends BaseTest {
    @Step("<wait> saniye bekle")
    public void waitForsecond(int wait) throws InterruptedException {
        Thread.sleep(1000 * wait);
        System.out.println(wait + "saniye bekledi !!!!");

    }

    @Step("<selectorid> id'li elemente tıkla")
    public void clickByid(String selectorid) {
        appiumDriver.findElement(By.id(selectorid)).click();
        System.out.println(selectorid + "Elementine tıklandır !!!");
    }

    @Step("<selectorxpath> xpath'li elemente tıkla")
    public void clickByXpath(String selectorXpath) {
        appiumDriver.findElement(By.xpath(selectorXpath)).click();
        System.out.println(selectorXpath + "Elementine tıklandır !!!");
    }

    @Step("<id> id'li elemete <text> text değerini yaz")
    public void sendKeysbyid(String id, String text) {
        appiumDriver.findElement(By.id(id)).sendKeys(text);
        System.out.println(text + "Değeri yazıldı !!!");
    }

    @Step("<selectorId> id'li element <keyword> text değerini içerdiğini kontrol et")
    public void elementControl(String selectorId, String keyword) {
        Assert.assertTrue("Elementi içeriyor", appiumDriver.findElement(By.id(selectorId)).getText().contains(keyword));
        //logger.info("Id'li elementi içeriyor");
    }

    @Step("<selectorXpath> xpath'li element <keyword> text değerini içerdiğini kontrol et")
    public void controlElement(String selectorXpath, String keyword) {
        Assert.assertTrue("Elementi içermiyor", appiumDriver.findElement(By.xpath(selectorXpath)).getText().contains(keyword));
        //logger.info("Xpath'li elementi içeriyor");
    }


}
