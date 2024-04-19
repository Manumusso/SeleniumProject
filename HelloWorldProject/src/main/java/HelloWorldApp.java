import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldApp {
    public static void main(String[] args){
        //System.out.print("Hello world");
        //System.setProperty("webdriver.chrome.driver",
        //        "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        driver.quit();
    }
}
