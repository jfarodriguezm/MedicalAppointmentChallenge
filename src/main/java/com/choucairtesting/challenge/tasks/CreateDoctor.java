package com.choucairtesting.challenge.tasks;

import com.choucairtesting.challenge.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static com.choucairtesting.challenge.userinterface.CreateDoctorPage.*;
import static com.choucairtesting.challenge.userinterface.CreatePatientPage.SAVE_BUTTON;

public class CreateDoctor implements Task {

    private List<Data> data;

    public CreateDoctor(List<Data> data) {
        this.data = data;
    }

    public static CreateDoctor with(List<Data> data) {
        return Tasks.instrumented(CreateDoctor.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CREATE_DOCTOR_BUTTON),
                Enter.theValue(data.get(0).getStrDoctorName()).into(INPUT_NAME),
                Enter.theValue(data.get(0).getStrDoctorLastName()).into(INPUT_LASTNAME),
                Enter.theValue(data.get(0).getStrDoctorTelephone()).into(INPUT_TELEPHONE),
                SelectFromOptions.byVisibleText(data.get(0).getStrDoctorIdType()).from(SELECT_ID_TYPE),
                Enter.theValue(data.get(0).getStrDoctorId()).into(INPUT_ID),
                Click.on(SAVE_BUTTON)
        );

    }
}
