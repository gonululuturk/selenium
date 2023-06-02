package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // sayfayi maximize yapmak önemli. kodlari bulamayabilir. web elemmentleri bulamayabilir.

        // drriver.manage : driveri yönet.   window: pencereleri     maximize(): byük (aslinda tam ekran) ama fullscreen den farkli
        // maximize kullanimini adet edinmek gerekiyor. hemen ayarlamak lazim.
        // getPosition : bize browserin pozisyonunu verir. sayfanin ilk acildiginda boyutunu verir. cok kullanilmaz.


        //browserin konumunu yazdiralim.
        System.out.println("Sayfanin konumu :" + driver.manage().window().getPosition());


        //browserin boyutlarini yazdiralim.
        System.out.println("Sayfanin boyutlari :" +driver.manage().window().getSize());


        // Browser'i maximize yapalim. ====>>>>> en cok bunu kullaniyoruz.
        driver.manage().window().maximize();


        /*
        bir  web sitesine gittimizde browser default olarak bir boyutta gelir. ve acilan browserdaki
        webelementlere browser maximize olmadigi icin ulasamayiz. dolayisiyla browser'i actiktan sonra
        maximize yaparsak driver butun webelementleri görür ve rahatlikla müdahele edebilir. bu yüzden browser'i
        actiktan sonra ilk olarak driver.manage().window().maximize() yapmamiz bizim webelementlere ulasmada
        isimizi kolaylastirir. boylelikle fail almamis oluruz.
         */

        //Sayfanin icinde gordugumuz tum kutucuklar tum kisimlar birer web elementidir.Bunlarin butunu web sayfasini olusturur.

        // Techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");


        //browserin konumunu yazdialim.
        System.out.println("Yeni Konum: " + driver.manage().window().getPosition());


        //browserin boyutlarini yazdiralim.
        System.out.println("Sayfanin yeni boyutlari :" +driver.manage().window().getSize());
        Thread.sleep(3000);

        //sayfayi minimize yapalim
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayi fullscreen yapalim
        driver.manage().window().fullscreen();
        Thread.sleep(3000);


        driver.manage().window().setPosition(new Point(15, 15)); //istedigimiz konuma getirir.
        driver.manage().window().setSize(new Dimension(600,600)); //istedigimiz boyuta getirir.
        Thread.sleep(3000);


        // sayfayi kapatalim
        driver.close();


                    //Thread.sleep Javadan gelir kac saniye dersek kodu bekletir ama
        //        // implicitlyWait() methodu Selenium dan gelir ve istenilen sayfa acilincaya kadar bekleme suresini belirtir.
        //        // implicitlyWait() methodu ile istedigimiz kadar bekleme suresi koyabiliriz.
        //        // Web elementini gordugu anda bir alt satira gecerek kodu okumaya devam eder

    }
}
