package day04;

import Utilities.TestBeforeAfter;
import com.github.dockerjava.core.exec.WaitContainerCmdExec;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ActionsTab extends TestBeforeAfter {
    /*
     //1. 'http://automationexercise.com' url'sine gidin

        //2. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
        //3. Yeni Kullanıcı Kaydı Kısmında; Adı ve e-posta adresini girin ve 'Kaydol' düğmesine tıklayın
        //4. 'ENTER ACCOUNT INFORMATION' ifadesinin görünür olduğunu doğrulayın
        //5. Doldurma ayrıntıları:
            // Mrs; Pasword( fake ), Doğum tarihi girin
            // 'Sign up for our newsletter!' seçin; 'Receive special offers from our partners!' onay kutusunu seçmeyin
            // Create Account butonuna kadarki kutucuklara ( First Name, Last name, Company gibi ) Fake bilgi girin.
                // Not : Country olarak "Canada" girin
        // 6 - Doldurulan Tüm bilgilere göz atabilmek için 5 sn bu ekranda bekleyin
        //7- 'Create Account düğmesine' tıklayın
        //8. 'ACCOUNT CREATED!' yazısının göründüğünü onaylayın
     */

    @Test
    public void test1() throws InterruptedException {
            //1. 'http://automationexercise.com' url'sine gidin
        driver.get("http://automationexercise.com");

        //    //2. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();

        //   //3. Yeni Kullanıcı Kaydı Kısmında; Adı ve e-posta adresini girin ve 'Kaydol' düğmesine
        WebElement ad=driver.findElement(By.xpath("//*[@name='name']"));
        Faker faker = new Faker();
        actions.click(ad).sendKeys(faker.name().username())
                .sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

 // //4. 'ENTER ACCOUNT INFORMATION' ifadesinin görünür olduğunu doğrulayın
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Enter Account Information']")).isDisplayed());

//        //5. Doldurma ayrıntıları:
//            // Mrs; Pasword( fake ), Doğum tarihi girin
//            // 'Sign up for our newsletter!' seçin; 'Receive special offers from our partners!' onay kutusunu seçmeyin
//            // Create Account butonuna kadarki kutucuklara ( First Name, Last name, Company gibi ) Fake bilgi girin.
//                // Not : Country olarak "Canada" girin

      WebElement onaykutusdu=driver.findElement(By.xpath("//*[@id='id_gender2']"));
      actions.click(onaykutusdu).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
              sendKeys(faker.internet().password()).sendKeys(Keys.TAB).
              sendKeys("27").sendKeys(Keys.TAB).sendKeys("Nisan").sendKeys(Keys.TAB).
              sendKeys("1989").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
      Thread.sleep(3000);

      //Adress İnformation kısmını doldurun
        WebElement firstname= driver.findElement(By.xpath("//*[@id='first_name']"));
        actions.click(firstname).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().name()).sendKeys(Keys.TAB).
                sendKeys(faker.address().secondaryAddress()).sendKeys(Keys.TAB).
                sendKeys(faker.address().secondaryAddress()).sendKeys(Keys.TAB).
                sendKeys("India").sendKeys(Keys.TAB).
                sendKeys(faker.address().state()).sendKeys(Keys.TAB).
                sendKeys(faker.address().city()).sendKeys(Keys.TAB).
                sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();



        // 7- 'Create Account düğmesine' tıklayın
        driver.findElement(By.xpath("//*[text()='Create Account']")).click();

        //     //8. 'ACCOUNT CREATED!' yazısının göründüğünü onaylayın
        Assert.assertTrue(driver.findElement(By.xpath("//h2")).isDisplayed());
    }
}
