package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JVTests extends TestBase {

    @BeforeMethod
    public void preCondition() {
        app.getJs().selectItemElements();
        app.getJs().selectTextBox();

    }

    @Test
    public void textBoxJS() {
        app.getJs().typeJS("John", "john@gmail.com");
        app.getJs().clickBtnJS();
    }
}
