import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DriverInit {
    public static void main(String[] str){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions(); //опции
        options.addArguments("start-maximized"); //настройки браузера
        WebDriver driver = new ChromeDriver(options); // запуск драйвера и браузера
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание
        driver.navigate().to("http://yandex.ru/");
        driver.findElement(By.linkText("Маркет")).click();
        //Для перевода курсора
        WebElement element = driver.findElement(By.linkText("Компьютерная техника"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        driver.findElement(By.linkText("Компьютеры")).click();
        driver.findElement(By.cssSelector("a._2qvOOvezty.SvBTI5gwNn._2EJs7HYaZ4")).click();
        System.out.println("The End");
    }
}
