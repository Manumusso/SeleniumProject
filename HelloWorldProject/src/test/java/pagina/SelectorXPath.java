package pagina;
import common.ClaseBase1;
import common.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectorXPath extends ClaseBase1 {
    @Test
    void test01(){
        WebElement element = driver.findElement(By.xpath("/html/body/div/form/p/input"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void test02(){
        WebElement element = driver.findElement(By.xpath("//input"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void test03(){
        WebElement element = driver.findElement(By.xpath("//input[@type = 'text']"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void test04(){
        WebElement element = driver.findElement(By.xpath("//*[@type = 'text']"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }

    @Test
    void test05(){
        WebElement element = driver.findElement(By.xpath("//*[text() = 'Lost your password?']"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void test06(){
        WebElement element = driver.findElement(By.xpath("//div/input'"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void test07(){
        WebElement element = driver.findElement(By.xpath("//form/p/following-sibling::p"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }

    @Test
    void test08(){
        WebElement element = driver.findElement(By.xpath("//input[contains(@id, 'er_log')]"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void test09(){
        WebElement element = driver.findElement(By.xpath("//input[starts-with(@id, 'user')]"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void test10(){
        WebElement element = driver.findElement(By.xpath("//input[@class='input' amd @name='log' and @type = 'text']'"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }

    @Test
    void test11(){
        WebElement element = driver.findElement(By.xpath("//input[@type and not (@name = 'log')]"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }

    @Test
    void test12(){
        WebElement element = driver.findElement(By.xpath("//label/../.."));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void test13(){
        WebElement element = driver.findElement(By.xpath("//form//input"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }

    @Test
    void test14(){
        WebElement element = driver.findElement(By.xpath("//input/ancestor::form"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void test15(){
        WebElement element = driver.findElement(By.xpath("//p[@class = 'submit]/preceding-sibling:p"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
    @Test
    void test16(){
        WebElement element = driver.findElement(By.xpath("//input[1]'"));
        SeleniumUtils.printElementInfo("Casilla de texto", element);
    }
}
