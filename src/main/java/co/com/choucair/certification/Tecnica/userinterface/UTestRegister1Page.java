package co.com.choucair.certification.Tecnica.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UTestRegister1Page extends PageObject {
    public static final Target Join_Button = Target.the("Es el boton para registrarse en la pagina")
            .located(By.xpath("//a[@class= 'unauthenticated-nav-bar__sign-up']//href[]contains(text(),'Join Today')"));
    public static final Target Nombre_Input = Target.the("Campo para escribir los nombres")
            .located(By.xpath("firstName"));
    public static final Target Apellidos_Input = Target.the("Campo para escribir los apellidos")
            .located(By.xpath("lastName"));
    public static final Target Correo_Input = Target.the("Campo para escribir el correo")
            .located(By.xpath("email"));
    public static final Target Lenguaje_Input = Target.the("Campo para elegir idiomas")
            .located(By.xpath("//div[@class= 'dui-select-container ui-select-multiple ui-select-bootstrap dropdown form-control ng-valid ng-not-empty']//strong[]span(text(),'ui-select-match"));
    public static final Target Enter_Button = Target.the("Siguiente").
            located(By.xpath("//button[contains(@class,''btn btn-blue)]"));
}
