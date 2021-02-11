package co.com.choucair.certification.Tecnica.tasks;

import co.com.choucair.certification.Tecnica.userinterface.UTestRegister1Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Date;

public class Register1 implements Task {
    /*Se declaran las variables de la calse UtestSpetDefinitions (Para la historia de usuario)*/
    private String strNombre;
    private String strApellido;
    private String strEmail;
    private Date DateFechaNaci;
    private String strLenguaje;

    public Register1(String strNombre, String strApellido, String strEmail,
                     Date DateFechaNaci, String strLenguaje) {
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strEmail = strEmail;
        this.DateFechaNaci = DateFechaNaci;
        this.strLenguaje = strLenguaje;
    }

    public static Register1 onThePage(String strNombre, String strApellido, String strEmail,
                                      String strLenguaje) {
        return Tasks.instrumented(Register1.class, strNombre,strApellido,strEmail,strLenguaje);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestRegister1Page.Join_Button),
                Enter.theValue(strNombre).into(UTestRegister1Page.Nombre_Input),
                Enter.theValue(strApellido).into(UTestRegister1Page.Apellidos_Input),
                Enter.theValue(strEmail).into(UTestRegister1Page.Correo_Input),
                Enter.theValue(strLenguaje).into(UTestRegister1Page.Lenguaje_Input),
                Click.on(UTestRegister1Page.Enter_Button)
        );
    }
}
