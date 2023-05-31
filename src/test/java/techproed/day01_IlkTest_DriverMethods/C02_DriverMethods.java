package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        // getTitle () Sayfa basligini verir.
        System.out.println("Amazon sayfa basligi :" + driver.getTitle());
        System.out.println("Amazon Actual Url :" + driver.getCurrentUrl());
        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle degeri : " + amazonWindowHandle);

        driver.get("https://techproeducation.com"); // get() methodu girilen url´e gidiyor.
        System.out.println("Techproed Actual Title sayfa basligi :" + driver.getTitle());// en son gittigi sayfa basligini verir.
        // Techpro education sayfa basligi :Techpro Education | Online It Courses & Bootcamps ===> verdi.


        // getCurrentUrl () gidilen sayfanin Url´ini String olarak verir.
        System.out.println("Techproed Actual Url :" + driver.getCurrentUrl()); // en son gittigi sayfanin Url verir.
        // bu method daha cok dogrulamalarda kullanilacak. ne gibi? bazen rka arkaya sayfalara gidiyoruz.
        // sonra back yaparak ilk sayfaya gitmek istiyoruz. bu gibi durumlarda gidip gitmedigini kontrol etmek icin kullanilir.


        // getPageSource() acilan sayfanin kaynak kodlarini verir.
        // bu method pek kullanilmiyor. dogrulamalarda kullanilir.
         //System.out.println(driver.getPageSource()); // bilerek yoruma aldik her calistirdigimizda konsola butun kaynak kodlarini verecegi icin., cok uzun oldugu icin.


        // getWindowHandle() gidilen sayfanin handle degerini (hashKod) verir. bu handle degerini sayfalar arasi gecis icin kullaniriz
        System.out.println("Techproed Window Handle degeri : " + driver.getWindowHandle()); // 868ACA62673F23C0226F53742267F7A7


    }
}