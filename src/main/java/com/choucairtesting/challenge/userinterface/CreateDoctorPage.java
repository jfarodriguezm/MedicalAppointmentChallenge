package com.choucairtesting.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateDoctorPage extends PageObject {

    public static final Target CREATE_DOCTOR_BUTTON = Target.the("button to create a new doctor")
            .located(By.xpath("//a[@href='addDoctor']"));
    public static final Target INPUT_NAME = Target.the("where do we write the name")
            .located(By.id("name"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the lastname")
            .located(By.id("last_name"));
    public static final Target INPUT_TELEPHONE = Target.the("where do we write the telephone")
            .located(By.id("telephone"));
    public static final Target SELECT_ID_TYPE = Target.the("where do we select the id type")
            .located(By.id("identification_type"));
    public static final Target INPUT_ID = Target.the("where do we write the id")
            .located(By.id("identification"));
    public static final Target SAVE_BUTTON = Target.the("button to save the medical appointment ")
            .located(By.xpath("//a[contains(text(),'Guardar')]"));
}
