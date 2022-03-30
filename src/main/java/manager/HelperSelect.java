package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HelperSelect extends HelperBase {
    public HelperSelect(WebDriver wd) {
        super(wd);
    }

    public void selectItemWidgets() {
        hideAds();
        click(By.xpath("//div//h5[text()='Widgets']"));
    }

    public void clickSelectMenu() {
        hideFooter();
        click(By.xpath("//span[.='Select Menu']"));
    }


    public void selectColor(String color) {
        Select select = new Select(wd.findElement(By.id("oldSelectMenu")));
        select.selectByVisibleText(color);
    }

    public void multiSelectCar(String cars) {//"volvo,saab,opel"
        Select select = new Select(wd.findElement(By.id("cars")));
        //nujno vibrat bolshe chem odnu opziu
        if (select.isMultiple()) {//true kogda multiple
            String[] all = cars.split(",");//[volvo][saab][opel] -<kollekziyap. razrezali 3 kuska stringov=massiv
            for (String s : all) {
                switch (s) {
                    case "volvo":
                        select.selectByValue("volvo");//iz kollekzii zabrali pervoe znachenie
                        break;
                    case "saab":
                        select.selectByValue("saab");
                        break;
                    case "opel":
                        select.selectByValue("opel");
                        break;
                    case "audi":
                        select.selectByValue("audi");
                        break;
                }
            }
        }
    }

    public void selectSalutation(String salutation) {
        wd.findElement(By.id("selectOne")).click();//kliknuli na pole i drop-down otkrilsia
        //zameniaem etot metod wd.findElement(By.xpath("//*[text()='Mr.']")).click();
        String locator = "//*[text()='" + salutation + "']";//vmesto Mr zapisivaem +salutation+
        wd.findElement(By.xpath(locator)).click();//locator eto string

    }
}