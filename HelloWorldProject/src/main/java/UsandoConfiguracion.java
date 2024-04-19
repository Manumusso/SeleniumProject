import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsandoConfiguracion {
    public static void main(String[] args) throws Exception{
        //System.out.print("Hello world");
        //System.setProperty("webdriver.chrome.driver",
        //        "drivers/chromedriver.exe");
        WebDriver driver = common.Configuration.createChromeDriver();
        driver.get("http://google.com");
        //driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        Thread.sleep(5000);
        //driver.quit();
    }
}
