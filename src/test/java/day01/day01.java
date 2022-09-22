package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


// youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
// (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        driver.get("https://youtube.com");

        System.out.println(driver.getTitle());

        if(driver.getTitle().contains("youtube")){
            System.out.println("true");
        }
        else{
            System.out.println("Actual Title:"+driver.getTitle());
        }


        // youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        // Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.

       if(driver.getCurrentUrl().contains("youtube")){
           System.out.println("True");
       }
       else{
           System.out.println("youtube.com");
       }
        // Daha sonra Amazon sayfasina gidin https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com/");
        // Youtube sayfasina geri donun
        driver.navigate().back();
        // Sayfayi yenileyin
        driver.navigate().refresh();
        // Amazon sayfasina donun
        driver.navigate().forward();
        // Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        // Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        // Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        // Sayfayi kapatin
        driver.close();
        driver.quit();






    }
}
