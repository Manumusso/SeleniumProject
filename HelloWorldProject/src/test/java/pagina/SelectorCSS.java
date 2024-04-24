package pagina;
import common.ClaseBase1;
import common.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SelectorCSS extends ClaseBase1 {
    @Test
    void testUsingInput(){
        WebElement element = driver.findElement(By.cssSelector("input"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void testUsingInputType(){
        WebElement element = driver.findElement(By.cssSelector("input[type]"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void testUsingTypePassword(){
        WebElement element = driver. findElement(By.cssSelector("input[type = 'password']"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
//
@Test
    void testUsingblings(){
        WebElement element = driver.findElement(By.cssSelector("label+input"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
        @Test
        void testUsingContains(){
            WebElement element = driver.findElement(By.cssSelector("input[id*='user']"));
            SeleniumUtils.printElementInfo("Casilla de texto", element);
        }
        @Test
        void testUsingStartWith(){
            WebElement element = driver.findElement(By.cssSelector("input[id^='user']"));
            SeleniumUtils.printElementInfo("Casilla de texto", element);
        }
        @Test
        void testUsingEndsWith()throws Exception{
            WebElement element = driver.findElement(By.cssSelector("input[id$='user']"));
            SeleniumUtils.printElementInfo("Casilla de texto", element);
            Thread.sleep(1000);
        }
        @Test
        void testUsingContainsWord(){
            WebElement element = driver. findElement(By.cssSelector("input[value~='Log']"));
            SeleniumUtils.printElementInfo("Casilla de texto", element);
        }

    @Test
    void testUsingOr(){
        WebElement element = driver.findElement(By.cssSelector("input,*[name='log']"));
        SeleniumUtils.printElementInfo("Boton", element);
    }
    @Test
    void testUsingAnd(){
        WebElement element = driver.findElement(By.cssSelector("input.input"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void testUsingNot(){
        WebElement element = driver. findElement(By.cssSelector("input:not([name='log'])"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void testUsingMultipleAttr(){
        WebElement element = driver. findElement(By.cssSelector("input[type][name][class]"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void testUsingMultipleAttr2(){
        WebElement element = driver. findElement(By.cssSelector("input[type = 'text'][name='log'][class='input']"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }

}
