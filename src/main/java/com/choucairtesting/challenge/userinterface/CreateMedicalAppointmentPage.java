package com.choucairtesting.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateMedicalAppointmentPage extends PageObject {
    public static final Target CREATE_APPOINTMENT_BUTTON = Target.the("button to create a new medical appointment")
            .located(By.xpath("//a[@href='appointmentScheduling']"));
    public static final Target INPUT_DATE = Target.the("where do we insert the date")
            .located(By.id("datepicker"));
    public static final Target INPUT_PATIENT_ID = Target.the("where do we insert the patient id")
            .located(By.xpath("//div[@class='form-group'][2]//input"));
    public static final Target INPUT_DOCTOR_ID = Target.the("where do we insert the doctor id")
            .located(By.xpath("//div[@class='form-group'][3]//input"));
    public static final Target INPUT_OBSERVATIONS = Target.the("where do we insert the appointment observations")
            .located(By.xpath("//div[@class='form-group']//textarea"));
    public static final Target SAVE_BUTTON = Target.the("button to save the medical appointment ")
            .located(By.xpath("//a[contains(text(),'Guardar')]"));
    public static final Target MESSAGE = Target.the("reply message")
            .located(By.xpath("//p"));
}
