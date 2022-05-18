package com.choucairtesting.challenge.tasks;

import com.choucairtesting.challenge.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;

import static com.choucairtesting.challenge.userinterface.CreatePatientPage.*;

public class CreatePatient implements Task {

    private List<Data> data;

    public CreatePatient(List<Data> data) {
        this.data = data;
    }

    public static CreatePatient with(List<Data> data) {
        return Tasks.instrumented(CreatePatient.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CREATE_PATIENT_BUTTON),
                Enter.theValue(data.get(0).getStrPatientName()).into(INPUT_NAME),
                Enter.theValue(data.get(0).getStrPatientLastName()).into(INPUT_LASTNAME),
                Enter.theValue(data.get(0).getStrPatientTelephone()).into(INPUT_TELEPHONE),
                SelectFromOptions.byVisibleText(data.get(0).getStrPatientIdType()).from(SELECT_ID_TYPE),
                Enter.theValue(data.get(0).getStrPatientId()).into(INPUT_ID),
                Check.whether(data.get(0).getStrPatientPrepaid().equals("Si"))
                        .andIfSo(Click.on(CHKBOX_PREPAID)),
                Click.on(SAVE_BUTTON)
        );
    }
}
