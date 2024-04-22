package pagina;

import common.ClaseBase1;
import common.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EstrategiaIdentificacion extends ClaseBase1 {

    @Test
    void testById(){
        WebElement element = driver.findElement(By.id(("user_pass")));
        SeleniumUtils.printElementInfo("Casilla de Password", element);
    }
    @Test
    void testByClassName(){
        WebElement element = driver.findElement(By.id(("input")));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void testByClassName2(){
        WebElement element = driver.findElement(By.id(("user_pass")));
        SeleniumUtils.printElementInfo("Boton de Login", element);
    }
    @Test
    void testByTagName(){
        WebElement element = driver.findElement(By.tagName(("input")));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
}
