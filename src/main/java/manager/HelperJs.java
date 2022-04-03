package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HelperJs extends HelperBase{

    public HelperJs(WebDriver wd) {
        super(wd);
    }

    public void selectItemElements() {
        hideAds();
        hideFooter();
        click(By.xpath("(//div[@class='card mt-4 top-card'])[1]"));
    }

    public void selectTextBox() {
        click(By.id("item-0")); ////span[text()='Text Box']
       // hideAds();  -> s etim metodot test pochemu-to padaet
        hideFooter();
    }

    public void typeJS(String name, String email) {
        JavascriptExecutor executor=(JavascriptExecutor) wd;
       // executor.executeScript("document.querySelector('#userName').value='John';"); -> nujno sdelat universalniy metod i razdelit string
        executor.executeScript("document.querySelector('#userName').value='"+name+"';");
        //executor.executeScript("document.querySelector('#userEmail').value='john@gmail.com");---> dojen priniat 2 stringa
        executor.executeScript(String.format("document.querySelector('#userEmail').value='%s';",email));
    }

    public void clickBtnJS() {
        JavascriptExecutor executor=(JavascriptExecutor) wd;
        executor.executeScript("document.querySelector('#submit').style.background='Red';");
        executor.executeScript("document.querySelector('#submit').click();");
    }
}
