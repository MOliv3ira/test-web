package pages;

import org.openqa.selenium.By;
import support.Action;
import support.driver.DriverManager;

public class UsersShow extends DriverManager {


    private By lblNotice = By.id("notice");
    private By btn_back = By.cssSelector(".ls-btn-primary-danger");
    private By lblCode = By.id("codigo");
    private By lblAge = By.id("age");
    private By lblEmail = By.id("email");
    private By lblFullName = By.id("full_name");
    private By lblLogin = By.id("login");

    public String getNotice() {
        return getDriver().findElement(lblNotice).getText();
    }

    public void clickBack() {
        getDriver().findElement(btn_back).click();
    }

    public String getCode() {
        return getDriver().findElement(lblCode).getText();
    }

    public String fillField(String field) {
        String res = "";
        switch (field){
            case "login": res = getLogin(); break;
            case "nome completo": res = getFullName(); break;
            case "email": res = getEmail(); break;
            case "idade": res = getAge(); break;
        }
        return res;
    }

    private String getAge() {
       return getDriver().findElement(lblAge).getText();
    }

    private String getEmail() {
      return getDriver().findElement(lblEmail).getText();
    }

    private String getFullName() {
       return getDriver().findElement(lblFullName).getText();
    }

    private String getLogin() {
        Action.getVisibleElement(lblLogin);
       return getDriver().findElement(lblLogin).getText();
    }
}

