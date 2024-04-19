package pagina;

import common.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class PropiedadesPagina {
    public static void main(String[] args) throws Exception{

        WebDriver driver = common.Configuration.createChromeDriver();
        //Ir a google
        driver.get(Configuration.ADMIN_URL);
        Thread.sleep(3000);
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("TITLE: " + driver.getTitle());
        System.out.println("PAGE SOURCE: " + driver.getPageSource());
        driver.quit();
    }
}
