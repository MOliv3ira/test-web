package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import support.Action;
import support.driver.DriverManager;

public class UsersGrid extends DriverManager {

    private By btn_new = By.id("btn-new");

    public void clickNewUser() {
        Action.getVisibleElement(btn_new); //AGUARDE ATÉ APARECER O BOTÃO
        getDriver().findElement(btn_new).click();
    }

    public void clickShowUser(String lastUser) {
        String elem = "btn-show_" + lastUser;
        By btnShowLastUser = By.id(elem);
        Action.getVisibleElement(btnShowLastUser);
        getDriver().findElement(btnShowLastUser).click();
    }

    public void clickEditUser(String lastUser) {
        String elem = "btn-edit_" + lastUser;
        By btnShowLastUser = By.id(elem);
        Action.getVisibleElement(btnShowLastUser);
        getDriver().findElement(btnShowLastUser).click();
    }

    public void clickDeleteUser(String lastUser) {
        String elem = "btn-delete_" + lastUser;
        By btnShowLastUser = By.id(elem);
        Action.getVisibleElement(btnShowLastUser);
        getDriver().findElement(btnShowLastUser).click();
    }

    public void clickConfirmDelete() {
        final Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    public boolean getShowButton(String lastUser) {
        String elem = "btn-show_" + lastUser;
        By btnUserShow = By.id(elem);
        return Action.existElement(btnUserShow, 10);
    }

}
