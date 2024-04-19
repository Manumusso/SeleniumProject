package common;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuration {

    public static String DRIVER_DIR = System.getProperty("user.dir")
            + File.separator
            + "drivers"
            + File.separator;
    public static String CHROME_DRIVER_PATH = DRIVER_DIR + "chromedriver";

    public static String IP = "http://20.169.202.27";
    public static String ADMIN_URL = IP + "/wp-admin";

    public static String modifyIfWindows(String inPath){
        if (System.getProperty("os.name").toLowerCase().contains("windows")){
            return inPath + ".exe";
        } else {
            return inPath;
        }
    }



    public static WebDriver createChromeDriver(){
        System.setProperty("webdriver.chrome.driver",
                        modifyIfWindows(CHROME_DRIVER_PATH));
        return new ChromeDriver();

    }
}
