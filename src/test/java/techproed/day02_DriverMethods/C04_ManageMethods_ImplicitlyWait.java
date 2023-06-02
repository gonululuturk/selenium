package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chroe.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        /*
       implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler.
        Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.
        Fakat belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir

          Thread.sleep() java kodlarini bizim belirttigimiz sure kadar bekler.30 saniye beklemesini belirtirsem
        30 saniye bekler ve alt satira gecer.
         */

        // implicitlyWait sayfa açılır açılmaz alt satıra geçiyor belirlediğimiz süreyi beklemiyor
        //Thread.sleep Belirttiğimiz sürenin bitmesini bekler.

        // İImplicit wait bir element için devam eden ve tekrar eden aramalar yapar. Explicit wait ise tek seferlik bir şeydir.
        // bir sayfadaki tüm web elementlerin oluşmasını max süre dolana kadar bekler
        //elementlerin görünür hale gelmesini bekler ve daha sonra işlemlerini gerçekleştirir.

        //Thread.sleep Javadan gelir kac saniye dersek kodu bekletir ama
        // implicitlyWait() methodu Selenium dan gelir ve istenilen sayfa acilincaya kadar bekleme suresini belirtir.
        // implicitlyWait() methodu ile istedigimiz kadar bekleme suresi koyabiliriz.
        // Web elementini gordugu anda bir alt satira gecerek kodu okumaya devam eder



        //techproed sayfasina gidelim
        String amazonUrl = "https://amazon.com";
        String techproUrl = "https://techproeducation.com";
        driver.get(techproUrl);


        //amazona gidelim
        driver.get(amazonUrl);

        //techpro sayfasina geri donelim
        driver.navigate().back();

        //sayfa basligini Techpro icerdigini test edelim
        String actualTitle =driver.getTitle();
        String aranankelime = "Techpro";

        if (actualTitle.contains(aranankelime)){
            System.out.println("test PASSED");
        }else System.out.println("test FAILED");


        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();


        //sayfa basligini Amazon icerdigini test edelim
        String actualTitleAmazon =driver.getTitle();
        String arananKelime2 = "Amazon";

        if (actualTitleAmazon.contains(arananKelime2)){
            System.out.println("test PASSED");
        }else System.out.println("test FAILED");
        /*
        bu kodu su sekilde de yazabiliriz.
            if (driver.getTitle().contains("Amazon")){
                 System.out.println("test PASSED");
            }else System.out.println("test FAILED");
         */


        //sayfayi kapat
        driver.close();


    }



    }

