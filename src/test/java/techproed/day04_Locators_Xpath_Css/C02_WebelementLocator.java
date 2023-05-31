package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebelementLocator {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // https://automationexercise.com/test_cases ===>> deneme yapabilicegimiz bir site.


        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://amazon.com");



        // arama kutusuna "city bike" yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);



        // sonuc yazısını yazdırın
        // 1-16 of 191 results for "city bike" ==>> bunu yazdirmaliyiz.

        List<WebElement> sonucYazisi = driver.findElements(By.className("sg-col-inner")); // uzun isimle denedik hata verdi. sonra baska bir locat denedik. sonuc dogru verdi.
        System.out.println("Sonuc Yazisi Ilk Index : " + sonucYazisi.get(0).getText()); // 1-16 of 161 results for "city bike"

        // xpATH  ile list kullanmadan tek seferde locate aldik.
        WebElement sonucYazisiXPath = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));

        // xpath aslinda nokta atisi tek elemani aliyor, yoksa list icerisinden list indexi ile sececektik.


        // sonuc sayısını yazdırın

        String [] sonucSayisi  = sonucYazisi.get(0).getText().split(" ");
        System.out.println("sonuc Sayisi = " + sonucSayisi[2]); // [1-16, of, 155, results, for, "city, bike"]



        //Sayfadaki 12. elementi list kullanmadan xpath'in index özelliğini kullanarak locate aldık
        WebElement onikinciElement = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[12]"));
        System.out.println("onikinci element : " + onikinciElement.getText());




        // ilk ürünün locatini alın

        List<WebElement> urunler = driver.findElements(By.className("s-image"));
        WebElement ilkUrun = urunler.get(0);



        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isDisplayed());  //True


        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isEnabled()); //True

        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isSelected()); //False döner çünkü webelement seçilme özelliğine sahip değil

        // ilk urune tıklayın
        ilkUrun.click(); // webElementin üzerine tiklar


        // sayfayı kapatın
        driver.close();




    }


    /*
        //ARAMA KUTUSUNUN HTML KODLARI
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
         placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto"
         tabindex="0" aria-label="Search Amazon" spellcheck="false">
         */
        //Relative Xpath syntax -->  //tagname[@attributeName='attributeValue']
                                     //input[@type='text']
                                     //(//input[@type='text'])[1]
                                    //*[@type='text']
        /*
        Aldigimiz xpath unique olmadigi zaman xpath' imizi parantez icine alarak index belirtebiliriz.
        Boylelikle webelementi List' e atip istedigimiz elementi almakla ugrasmayiz
        Xpathi ın degısık kullanma yolları vardır
         */


}
