package tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AlertTests extends TestBase{


    @BeforeMethod
    public void preconditions() {
        app.alert().selectItemAlert();
        app.alert().selectAlerts();
    }





    }

