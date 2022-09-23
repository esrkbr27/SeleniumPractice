package day05;

import Utilities.TestBeforeAfter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class İframe extends TestBeforeAfter {
    /*
    "http://webdriveruniversity.com/IFrame/index.html" sayfasina gidin
"Our Products" butonuna basin
"Cameras product"i tiklayin
    Popup mesajini yazdirin
"close" butonuna basin
"WebdriverUniversity.com (IFrame)" linkini tiklayin
"http://webdriveruniversity.com/index.html" adresine gittigini test edin*/

    @Test
    public void test1() {
        //1."http://webdriveruniversity.com/IFrame/index.html" adresine gidin.
       driver.get("http://webdriveruniversity.com/IFrame/index.html");

       //2."Our Products" butonuna basin
        //"Cameras product"i tiklayin
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
        WebElement ourproduct=driver.findElement(By.xpath("//*[text()='Our Products']"));
        ourproduct.click();

        //3.“Cameras product”i tiklayin
        driver.findElement(By.xpath("(//*[@class='sub-heading'])[2]")).click();
        //4.Popup mesajini yazdirin
        System.out.println(driver.findElement(By.xpath("//h4")).getText());
        //5.“close” butonunabasin
        driver.findElement(By.xpath("//*[text()='Close']")).click();
        driver.switchTo().parentFrame();
        //6."WebdriverUniversity.com (IFrame)" linkini tiklayin
        driver.findElement(By.xpath("//*[text()='WebdriverUniversity.com (IFrame)']")).click();
        //7."http://webdriveruniversity.com/index.html" adresine gittigini testedin
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="http://webdriveruniversity.com/index.html";
        Assert.assertEquals(expectedUrl, actualUrl);
        //Assert.assertTrue(actualUrl.equals(expectedUrl));
    }
}
