package co.com.choucair.certification.Tecnica.stepdefinitions;

import co.com.choucair.certification.Tecnica.tasks.Home;
import co.com.choucair.certification.Tecnica.tasks.OpenUp;
import co.com.choucair.certification.Tecnica.model.UTestData;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.Tecnica.tasks.Register1;
import co.com.choucair.certification.Tecnica.tasks.Register2;

import java.util.List;

public class UTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());}
        @Given("^Juan quiere registrase en Utestcom primer paso$")
    public void JuanquiereregistraseenUtestcomprimerpaso(List<UTestData> UTestData) throws Exception{
            OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(),
                Register1.onThePage(UTestData.get(0).getStrNombre(), UTestData.get(0).getStrApellido(),
                        UTestData.get(0).getStrEmail(),UTestData.get(0).getStrLenguaje()));
        }
    @When("^el continua registrandose en las secciones 2,3 y 4$")
    public void elcontinuaregistrandoseenlassecciones23y4(List<UTestData> UTestData) throws Exception {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(),
                Register2.onThePage(UTestData.get(0).getStrCiudad(), UTestData.get(0).getIntCodigo(),
                        UTestData.get(0).getSrtPais(),UTestData.get(0).getStrDispositivo(),UTestData.get(0).getStrConfirmarCon(),
                        UTestData.get(0).getStrContrasena(),UTestData.get(0).getStrVersion()));
    }
    @Then("^El confirma que ya este en la pagina de Utest$")
    public void ElconfirmaqueyaesteenlapaginadeUtest(List<UTestData> UTestData)throws Exception {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(),
                Home.onThePage(UTestData.get(0).getStrHome()));
    }

}
