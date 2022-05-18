package com.choucairtesting.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreatePatientPage extends PageObject {
    public static final Target CREATE_PATIENT_BUTTON = Target.the("button to create a new patient")
            .located(By.xpath("//a[@href='addPatient']"));
    public static final Target INPUT_NAME = Target.the("where do we write the name")
            .located(By.name("name"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the lastname")
            .located(By.name("last_name"));
    public static final Target INPUT_TELEPHONE = Target.the("where do we write the telephone")
            .located(By.name("telephone"));
    public static final Target SELECT_ID_TYPE = Target.the("where do we select the id type")
            .located(By.name("identification_type"));
    public static final Target INPUT_ID = Target.the("where do we write the id")
            .located(By.name("identification"));
    public static final Target CHKBOX_PREPAID = Target.the("where do we check prepaid health")
            .located(By.name("prepaid"));
    public static final Target SAVE_BUTTON = Target.the("button to save the medical appointment ")
            .located(By.xpath("//a[contains(text(),'Guardar')]"));
}
