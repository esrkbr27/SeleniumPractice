package day04;

import Utilities.TestBeforeAfter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Actions extends TestBeforeAfter {
    /*
    //Ödev 1
//Yeni Class olusturun ActionsClassHomeWork
//1- "http://webdriveruniversity.com/Actions" sayfasina gidin
  2- Hover over Me First" kutusunun ustune gelin
//Link 1" e tiklayin
//Popup mesajini yazdirin
//Popup'i tamam diyerek kapatin
//"Click and hold" kutusuna basili tutun
//7-"Click and hold" kutusunda cikan yaziyi yazdirin
//8- "Double click me" butonunu cift tiklayin
     */

    @Test
    public void test01() throws InterruptedException {
        driver.get("http://webdriveruniversity.com/Actions");

        WebElement hover=driver.findElement(By.xpath("//*[text()='Hover Over Me First!']"));
        actions.moveToElement(hover).perform();

        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[text()='Link 1'])[1]")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        WebElement click=driver.findElement(By.xpath("//*[text()='Click and Hold!']"));
        actions.clickAndHold(click).perform();

        System.out.println(driver.findElement(By.xpath("//*[@id='click-box']")).getText());

        WebElement doublea=driver.findElement(By.xpath("//h2"));
        actions.doubleClick(doublea).perform();
    }
}
