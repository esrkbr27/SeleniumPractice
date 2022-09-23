package day04;

import Utilities.TestBeforeAfter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class İframe extends TestBeforeAfter {
    /*
    Bir Class olusturalim KeyboardActions2
https://html.com/tags/iframe/ sayfasina gidelim
 3- video’yu gorecek kadar asagi inin
videoyu izlemek icin Play tusuna basin
videoyu calistirdiginizi test edin
     */

    @Test
    public void test1() {

        driver.get("https://html.com/tags/iframe/");

        //sayfada videoyu asagıda görmek için;
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        //asagı indik, videoyyu gördük ama video üzerinde sag click yapılamadıgı için
        //bu bir iframedir.Videonun hemen yakınına sag click yapıp incele deyince iframe
        //tagını görduk.Videoya tıklamak için önce driveri iframe gecirmem lazım
        WebElement iframe=driver.findElement(By.className("ytp-cued-thumbnail-overlay-image"));

        driver.switchTo().frame(iframe);
        WebElement buton=driver.findElement(By.xpath("//*[@aria-label='Oynat']"));
        buton.click();


    }
}
