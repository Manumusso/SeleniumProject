package pagina;
import common.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebaBasica {
    //Lab 3.5Usando JUNIT Test Fixtures.
    //Lab 3.6 Usando JUNIT Test Fixtures.
    static WebDriver driver = null;
    //Assertion con error:
    @BeforeAll
    static void setup(){
        driver = Configuration.createChromeDriver();
    }
    @AfterAll
    static void tearDown(){
        driver.quit();
    }
    @Test
    void testTituloPagina() throws InterruptedException{
        //Init: declaración de variables, instanciar, etc.
        driver.get((Configuration.ADMIN_URL));
        Thread.sleep(3000);

        //Arrange: declaración de variables, instanciar, etc PROPIO DE LA PRUEBA.
        String expectedTitle = "Log In ‹ User's blog — WordPress";
        // Act : acción de llamar al método que se va a probar
        String actualTitle = driver.getTitle();
        //Assert: Es la evaluación:
        assertEquals(expectedTitle, actualTitle);

    }
    //Assertion sin error:
    @Test
    void testTituloPagina2() throws InterruptedException{
        WebDriver driver = Configuration.createChromeDriver();
        driver.get((Configuration.ADMIN_URL));
        String expectedTitle = "Log In ‹ User's blog — WordPress";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle, "El título de la página no es el esperado");
        driver.quit();
    }
}
