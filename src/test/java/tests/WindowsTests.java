package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsTests extends TestBase{

    @BeforeMethod
    public void preconditions(){
        app.alert().selectItemAlert();
        app.windows().selectBrowserWindows();
    }

    @Test
    public void test(){

    }
}
