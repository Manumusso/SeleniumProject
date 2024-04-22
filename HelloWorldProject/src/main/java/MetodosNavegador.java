import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class MetodosNavegador {
    public static void main(String[] args) throws Exception{
        //Lab 3.3 Explorando métodos de navegador
        WebDriver driver = common.Configuration.createChromeDriver();
        //Ir a google
        driver.get("http://google.com");

        // ver dirección que estamos en la url:
        System.out.println("Paso 1: Estamos en la url en: " + driver.getCurrentUrl());
        System.out.println("Estamos en el título en: " + driver.getTitle());
        System.out.println("Estamos en el título en: " + driver.getTitle());


        //En la misma ventana vamos a otra url dentro de la misma ventana.
        driver.navigate().to("http://20.169.202.27/wp-admin/");
        System.out.println("Paso 2: Estamos en la url en: " + driver.getCurrentUrl());


        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);


        //driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        String currentWindows = driver.getWindowHandle();
        System.out.println("current Windows: " + currentWindows);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.manage().deleteAllCookies();
        driver.get("https://www.infobae.com/");


        String newWindows = driver.getWindowHandle();
        System.out.println("new Windows: " + newWindows);

        System.out.println("# de ventanas abiertas: " + driver.getWindowHandles().size());
        driver.switchTo().window(newWindows).close();
        System.out.println("# de ventanas abiertas " + driver.getWindowHandles().size());

        driver.quit();
    }
}
