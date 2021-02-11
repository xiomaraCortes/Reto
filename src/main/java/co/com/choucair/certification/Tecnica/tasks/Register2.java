package co.com.choucair.certification.Tecnica.tasks;

import co.com.choucair.certification.Tecnica.userinterface.UTestRegister1Page;
import co.com.choucair.certification.Tecnica.userinterface.UTestRegister2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register2 implements Task {
    private String strCiudad;
    private Integer intCodigo;
    private String srtPais;
    private String strDispositivo;
    private String strConfirmarCon;
    private String strVersion;
    private String strContrasena;

    public Register2(String strCiudad, Integer intCodigo, String srtPais,
                     String strDispositivo, String strConfirmarCon,String strContrasena, String strVersion ) {
        this.strCiudad = strCiudad;
        this.intCodigo = intCodigo;
        this.srtPais = srtPais;
        this.strDispositivo = strDispositivo;
        this.strConfirmarCon = strConfirmarCon;
        this.strVersion = strVersion;
        this.strContrasena = strContrasena;

    }

    public static Register2 onThePage(String strCiudad, Integer intCodigo, String srtPais,
                                      String strDispositivo, String strConfirmarCon, String strContrasena, String strVersion) {
        return Tasks.instrumented(Register2.class, strCiudad,intCodigo,srtPais,strDispositivo,strConfirmarCon,strContrasena,strVersion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestRegister1Page.Enter_Button),
                Enter.theValue(strCiudad).into(UTestRegister2Page.Ciudad_Input),
                Enter.theValue(srtPais).into(UTestRegister2Page.Pais_Input),
                Click.on(UTestRegister2Page.Enter1_Button),
                Enter.theValue(strDispositivo).into(UTestRegister2Page.Dispositivo_Input),
                Enter.theValue(strVersion).into(UTestRegister2Page.Version_Input),
                Click.on(UTestRegister2Page.Enter2_Button),
                Enter.theValue(strContrasena).into(UTestRegister2Page.Contrasena_Input),
                Enter.theValue(strConfirmarCon).into(UTestRegister2Page.ConfiContrasela_Input),
                Click.on(UTestRegister2Page.Enter3_Button)
                );
    }
}

