package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class webelement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // https://amazon.com sayfasına gidin
        driver.get("https://amazon.com ");
        // sayfada "shoe" icin arama yaptırıp ,
        WebElement aramak=driver.findElement(By.id("twotabsearchtextbox"));
        aramak.sendKeys("shoe", Keys.ENTER);
        //ilgili sorgunun sonuclarin yazdirin
      List<WebElement> sonucsy=driver.findElements(By.className("sg-col-inner"));
        System.out.println(sonucsy.get(0).getText());
        // listelenen urunlerden ilkine tiklayalim
        List<WebElement> ilkResm=driver.findElements(By.className("s-image"));
        ilkResm.get(0).click();
        // goruntulenen urunun ozelliklerini yazdiralim

        // ustteki linklerden Sell linkinin tag name'inin a oldugunu dogrulayin

      WebElement sell=  driver.findElement(By.linkText("Sell"));

      if(sell.equals("a")){
          System.out.println("Test PASSED");
      }
        //   Registry linkinin class attribute degerini yazdirin

        WebElement register=driver.findElement(By.linkText("Registry"));
        System.out.println(register.getAttribute("class"));
        // add-to-cart-button'ın erisilebilir oldugunu test edin

        
        //sag taraftaki "Add a gift receipt for easy returns" buton secilimi kontrol ediniz
        // sayfayı kapatin

    }
}
