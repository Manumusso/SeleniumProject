package pagina;
import common.ClaseBase1;
import common.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class IdentificacionBasica extends ClaseBase1 {
    @Test
    void testByName(){
        WebElement usernameTextField = driver.findElement(By.name("pwd"));
        //System.out.println(usernameTextField);
        SeleniumUtils.printElementInfo("Casilla de texto", usernameTextField);
        //Inner te muestra lo de adentro.
        //outer: el elemento y lo de adentro.
    }
}
