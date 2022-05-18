package com.choucairtesting.challenge.tasks;

import com.choucairtesting.challenge.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.choucairtesting.challenge.userinterface.CreateMedicalAppointmentPage.*;

public class CreateMedicalAppointment implements Task {

    private List<Data> data;

    public CreateMedicalAppointment(List<Data> data) {
        this.data = data;
    }

    public static CreateMedicalAppointment with(List<Data> data) {
        return Tasks.instrumented(CreateMedicalAppointment.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CREATE_APPOINTMENT_BUTTON),
                Enter.theValue(data.get(0).getStrAppointmentDate()).into(INPUT_DATE).thenHit(Keys.ENTER),
                Enter.theValue(data.get(0).getStrPatientId()).into(INPUT_PATIENT_ID),
                Enter.theValue(data.get(0).getStrDoctorId()).into(INPUT_DOCTOR_ID),
                Enter.theValue(data.get(0).getStrObservations()).into(INPUT_OBSERVATIONS),
                Click.on(SAVE_BUTTON)
        );
    }
}
