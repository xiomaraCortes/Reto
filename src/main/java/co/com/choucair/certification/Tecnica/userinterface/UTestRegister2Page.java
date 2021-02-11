package co.com.choucair.certification.Tecnica.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestRegister2Page extends PageObject{
    public static final Target Ciudad_Input = Target.the("Es el para elegir la ciudad")
            .located(By.xpath("//div[@ng-if=isGoogleMapsAvailable()]//i[]contains(text(),'Bogota')"));
    public static final Target Codigo_Input = Target.the("Codigo postal")
            .located(By.xpath("//div[@ng-blur=geocodeAddress]//i[]contains(text(),'111')"));
    public static final Target Pais_Input = Target.the("Campo escoger pais")
            .located(By.xpath("//div[@class= 'ui-select-match']//span[]contains(text(),'Colombia')"));
    public static final Target Enter1_Button = Target.the("Siguiente").
            located(By.xpath("//button[contains(@class,''btn btn-blue)]"));
    public static final Target Dispositivo_Input = Target.the("Campo para escribir Dispositivo")
            .located(By.xpath("Windows"));
    public static final Target Version_Input = Target.the("Campo para escribir version del  Dispositivo")
            .located(By.xpath("10"));
    public static final Target Enter2_Button = Target.the("Siguiente").
            located(By.xpath("//button[contains(@class,'btn btn-blue pull-right')]"));
    public static final Target Contrasena_Input = Target.the("Campo para escribir Contraseña")
            .located(By.xpath("password"));
    public static final Target ConfiContrasela_Input = Target.the("Campo para escribir version del dispositivo")
            .located(By.xpath("confirmPassword"));
        public static final Target Enter3_Button = Target.the("Siguiente").
            located(By.xpath("//button[contains(@class,'btn btn-blue pull-right')]"));
}
