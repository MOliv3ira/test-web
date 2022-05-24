package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import support.Action;
import support.Verifications;
import support.driver.DriverManager;
import support.report.Report;

@Log4j2
public class HomeLinkedin extends DriverManager implements CommonTestingType {

    private By feed = By.cssSelector("#ember17 > svg > use");

    @Override
    public boolean isPresent() {
        Report.takeScreenShot();
        return Verifications.verifyElementIsVisible(feed);
    }


}
