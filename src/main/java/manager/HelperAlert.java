package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HelperAlert extends HelperBase{
    public HelperAlert(WebDriver wd) {
        super(wd);
    }

    public void selectItemAlert() {
        hideFooter();
        hideAds();
        click(By.xpath("//div/h5[.='Alerts, Frame & Windows']"));

    }

    public void selectAlerts() {
      //  hideAds();
        hideFooter();
        click(By.xpath("//span[text()='Alerts']"));
    }


}
