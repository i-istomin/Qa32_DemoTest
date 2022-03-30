package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperWindows extends HelperBase{
    public HelperWindows(WebDriver wd) {
        super(wd);
    }

    public void selectBrowserWindows() {
        hideAds();
        hideFooter();
        click(By.xpath("//span[.='Browser Windows']"));
    }



}
