package pages;

import org.openqa.selenium.By;
import support.Action;
import support.Verifications;
import support.driver.DriverManager;
import support.report.Report;

public class CreatePublication extends DriverManager implements CommonTestingType {

    private By btnCreatePublication = By.xpath("//button[@class='artdeco-button artdeco-button--muted artdeco-button--4 artdeco-button--tertiary ember-view share-box-feed-entry__trigger']");
    private By inputPost = By.xpath("//div[@class='ql-editor ql-blank']");
    private By btnPublish = By.xpath("//button[@class='share-actions__primary-action artdeco-button artdeco-button--2 artdeco-button--primary ember-view']");
    private By lblNotice = By.xpath("//p[@class='artdeco-toast-item__message']");


    public void clickCreatePublication() {
        Action.getVisibleElement(btnCreatePublication);
        getDriver().findElement(btnCreatePublication).click();
        Report.takeScreenShot();
    }

    public void fillField(String field, String value) {
        switch (field){
            case "post": fillPost(value); break;
        }
    }

    private void fillPost(String value) {
        Action.getVisibleElement(inputPost);
        getDriver().findElement(inputPost).sendKeys(value);
        Report.takeScreenShot();
    }

    public void clickPublish() {
        Action.getVisibleElement(btnPublish);
        getDriver().findElement(btnPublish).click();
        Report.takeScreenShot();
    }


    @Override
    public boolean isPresent() {
        Action.getVisibleElement(lblNotice);
        Report.takeScreenShot();
        return Verifications.verifyElementIsVisible(lblNotice);
    }
}
