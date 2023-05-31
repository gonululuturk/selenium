package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        // java uygulamalarinda system özelliklerini ayarlamak icin setProperty methodu ile kullaniriz.
        // setProperty() methodu ile classimiza driver´in fiziki yolunu belirtmis oluruz.

        System.out.println(System.getProperty("chromeDriver"));
        // getproperty ile "Key" degerini girerek "value" ya ulasabilirim.

        WebDriver driver = new ChromeDriver();
        //webDriver ara yüzünden chromeDriver türünde yeni bir Driver olustur dememiz gerekiyor.
        // ChromeDriver türünde yeni bir obje olusturduk.

        driver.get("https://techproeducation.com");//get() methodu ile String olarak girilen url´e gideriz.


    }
}
