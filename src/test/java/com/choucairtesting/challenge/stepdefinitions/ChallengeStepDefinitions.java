package com.choucairtesting.challenge.stepdefinitions;

import com.choucairtesting.challenge.model.Data;
import com.choucairtesting.challenge.questions.TheAswer;
import com.choucairtesting.challenge.tasks.CreateDoctor;
import com.choucairtesting.challenge.tasks.CreateMedicalAppointment;
import com.choucairtesting.challenge.tasks.OpenUp;
import com.choucairtesting.challenge.tasks.CreatePatient;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ChallengeStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que Carlos necesita utilizar el sistema de administracion de hospitales$")
    public void que_Carlos_necesita_utilizar_el_sistema_de_administracion_de_hospitales() {
        theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());

    }

    @Cuando("^el realiza el registro de un doctor en el aplicativo de Administracion de Hospitales$")
    public void el_realiza_el_registro_de_un_doctor_en_el_aplicativo_de_Administracion_de_Hospitales(List<Data> data)  {
        theActorInTheSpotlight().attemptsTo(CreateDoctor.with(data));
    }

    @Cuando("^el realiza el registro de un paciente en el aplicativo de Administracion de Hospitales$")
    public void el_realiza_el_registro_de_un_paciente_en_el_aplicativo_de_Administracion_de_Hospitales(List<Data> data)  {
        theActorInTheSpotlight().attemptsTo(CreatePatient.with(data));

    }

    @Cuando("^el realiza el agendamiento de una Cita$")
    public void el_realiza_el_agendamiento_de_una_Cita(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(CreateMedicalAppointment.with(data));
    }

    @Entonces("^el verifica que se presente en pantalla el mensaje (.*)$")
    public void el_verifica_que_se_presente_en_pantalla_el_mensaje_Datos_guardados_correctamente(String question)  {
        theActorInTheSpotlight().should(seeThat(TheAswer.toThe(question)));

    }
}
