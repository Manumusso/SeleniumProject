package pagina;

import common.ClaseBase1;
import common.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IdentificacionLinkText extends ClaseBase1 {
    @Test
    void testByLinkText(){
        WebElement element = driver.findElement(By.linkText("Lost your password?"));
        SeleniumUtils.printElementInfo("Link last your password", element);
    }
    @Test
    void testByPartialLinkText(){
        WebElement element = driver.findElement(By.partialLinkText("User's blog"));
        SeleniumUtils.printElementInfo("Link Back to WordPress", element);
    }
}
