package common;

import org.openqa.selenium.WebDriver;

import java.io.File;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//Asegurarse que junit no este restringido a scope test.
public class ClaseBase1 {
    //Labs 3.7 Consultando elementos web

    protected static WebDriver driver = null;
    @BeforeAll
    public static void  launchBrowser() throws Exception{
        driver = Configuration.createChromeDriver();
        driver.get((Configuration.ADMIN_URL));
        Thread.sleep(2000);
    }
    @AfterAll
    static void closeBrowser(){
        driver.quit();
    }
}
