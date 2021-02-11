package co.com.choucair.certification.Tecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class UTestHome  {
    public static final Target Continuar_Button = Target.the("Es el boton para registrarse en la pagina")
            .located(By.xpath("//a[@class= 'btn btn-blue']//href[]contains(text(),'Complete Setup')"));

}
