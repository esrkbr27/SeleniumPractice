package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazona gidelim
        driver.get("https:amazon.com");
        //aramam cubuguna  gidelim
        WebElement aramak=driver.findElement(By.id("twotabsearchtextbox"));

        //kitabı aratalım,entera basalım
        aramak.sendKeys("Mesnevi Temelli Değerler Eğitimi", Keys.ENTER);

        //sayfadakı link sayısı
        List<WebElement> list=driver.findElements(By.tagName("a"));
        System.out.println("sayfadakı link sayısı"+list.size());
        driver.close();


    }
}
