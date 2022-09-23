package day04;

import Utilities.TestBeforeAfter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown extends TestBeforeAfter {
    /*
    //Ödev 3
//-  amazon gidin
//Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
//dropdown menude 40 eleman olduğunu doğrulayın
//dropdown menuden elektronik bölümü seçin
//arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
//sonuc sayisi bildiren yazinin iphone icerdigini test edin
//ikinci ürüne relative locater kullanarak tıklayin
//ürünün title'ni ve fiyatını variable'a  assign edip ürünü sepete ekleyelim


     */

    @Test
    public void test1() {
        driver.get("https://amazon.com.tr");
      //  WebElement ddm=driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));

      //  List<WebElement> drops =driver.findElements(By.xpath("//*[@id='searchDropdownBox']"));
      //  System.out.println(drops.size());






    }
}
