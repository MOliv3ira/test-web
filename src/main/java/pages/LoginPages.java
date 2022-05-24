package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import support.Action;
import support.Verifications;
import support.driver.DriverManager;
import support.report.Report;

import java.util.HashMap;

@Log4j2
public class LoginPages extends DriverManager implements CommonTestingType {

    private By txtUsuario = By.id("username");
    private By txtSenha = By.id("password");
    private By btnEntrar = By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button");
    private By inputLogin = By.id("username");
    private By inputPassword = By.id("password");
    private By lblElement = By.xpath("//*[@id=\"organic-div\"]/div[1]/h1");

    @Override
    public boolean isPresent() {
        Report.takeScreenShot();
        return Verifications.verifyElementIsVisible(lblElement);
    }

    public void acessarAplicacao() {
        getDriver().get(configuration.url());
//        Report.takeScreenShot();
    }

    public void executarLogin(HashMap data) {
        Action.setText(txtUsuario, data.get("user"));
        getDriver().findElement(txtSenha).sendKeys((CharSequence) data.get("password"));
        Report.takeScreenShot();
        Action.clickOnElement(btnEntrar);
    }

    public void fillField(String field, String value) {
        switch (field){
            case "login": fillLogin(value); break;
            case "password": fillPassword(value); break;
        }
    }

    private void fillPassword(String value) {
        Action.getVisibleElement(inputPassword);
        getDriver().findElement(inputPassword).sendKeys(value);
    }

    private void fillLogin(String value) {
        Action.getVisibleElement(inputLogin);
        getDriver().findElement(inputLogin).sendKeys(value);
    }

    public void clickEnter() {
        getDriver().findElement(btnEntrar).click();
    }

}
