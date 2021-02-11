package co.com.choucair.certification.Tecnica.tasks;

import co.com.choucair.certification.Tecnica.userinterface.UTestHome;
import co.com.choucair.certification.Tecnica.userinterface.UTestRegister1Page;
import co.com.choucair.certification.Tecnica.userinterface.UTestRegister2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Date;

public class Home implements Task{
    private String StrHome;

    public Home(String StrHome) {
        this.StrHome = StrHome;
    }
    public static Home onThePage(String StrHome) {
        return Tasks.instrumented(Home.class, StrHome);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestRegister2Page.Enter3_Button),
                Click.on(UTestHome.Continuar_Button)
        );
    }
}
