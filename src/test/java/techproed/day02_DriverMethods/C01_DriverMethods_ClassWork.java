package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1)  Amazon sayfasina gidelim.
        // 2) sayfa basliginin Amazon icerdigini test edelim
        // 3) Url´in https://amazon.com oldugunu test edelim
        // 4) sayfayi kapatalim


        //*** 1. SORU *****
        driver.get("https://amazon.com");


        // **** 2. SORU ***
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";

        if (actualTitle.contains(expectedTitle)) {  // "icerdig"i dedigi icin contains kullaniyoruz.
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");

        /*
            //Amazon sayfasina gidelim
            driver.get("https://amazon.com");
            //Sayfa basliginin Amazon icerdigini test edelim
            String actualTitle=driver.getTitle();  //driver.getTitle'i bir String'e assign ettik
            String expectedTitle="Amazon"; //Burada bizden ne istendiyse o degeri yazariz. Amazon istendigi icin
            //deger olarak Amazon yazdik
            if(actualTitle.contains(expectedTitle)){
            System.out.println("TEST PASSED");
            }else System.out.println("TEST FAILED");  //TEST PASSED sonucunu verdi.
            //bir harfi kucuk yazdik ornek amazon yazinca TEST FAILED sonucu yazildi.
         */


        /*
            actual = anlık, şuanki, gerçekte olan ve sorguladıgımızda karsımıza cıkacak olan
            expected= task de olmasını beklediğimiz hali
            //testeer olarak asil amacimiz actual ile expected karsilastirilmasidir. actual expected i iceriyor ise passed icermiyor ise failed aliriz
         */

        // **** 3. SORU ***
        //Url'in https://www.amazon.com olduğunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED -> "+actualUrl);

        // ilk yaptigimizda failed dedi cunku sonda / eksik. onu sorup tamamlayip testin gecmesini saglayabiliriz.

        // **** 4. SORU **
        //Sayfayı kapatalım
        driver.close();//Browser'ı kapatır
        //driver.quit();-> Birden fazla browser varsa hepsini kapatır.

    }
}
