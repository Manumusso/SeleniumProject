package accion;
import common.ClaseBase1;
import common.Configuration;
import common.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IngresarVerificarTexto extends ClaseBase1 {
    @Test
    void testIngresarUserName(){
        String usuarioEsperado = Configuration.USER;

        WebElement element = driver.findElement(By.id("user_login"));
        assertTrue(element.isEnabled(),
        "Verifico que el username esta habilitado");
        element.sendKeys(usuarioEsperado);
        String usuarioActual = element.getAttribute("value");
        assertEquals(usuarioEsperado,usuarioActual, "Verifico que el usuario ingresado es igual al actual");

    }


}
