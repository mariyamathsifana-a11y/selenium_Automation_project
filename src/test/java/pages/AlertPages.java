package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPages {

    WebDriver driver;
    WebDriverWait wait;
    String message;

    public AlertPages(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Simple Alert
    public void simpleAlert() {

        WebElement button = driver.findElement(By.id("alertBtn"));

        button.click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        message = alert.getText();

        alert.accept();
    }


    // Confirmation Alert - OK
    public void confirmationAlertOK() {

        WebElement button = driver.findElement(By.id("confirmBtn"));

        button.click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.accept();

        message = driver.findElement(By.id("demo")).getText();
    }


    // Confirmation Alert - Cancel
    public void confirmationAlertCancel() {

        WebElement button = driver.findElement(By.id("confirmBtn"));

        button.click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.dismiss();

        message = driver.findElement(By.id("demo")).getText();
    }


    // Prompt Alert - OK
    public void promptAlertOK(String Promptalert) {

        WebElement button = driver.findElement(By.id("promptBtn"));

        button.click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.sendKeys(Promptalert);

        alert.accept();

        message = driver.findElement(By.id("demo")).getText();
    }


    // Prompt Alert - Cancel
    public void promptAlertCancel() {

        WebElement button = driver.findElement(By.id("promptBtn"));

        button.click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.dismiss();

        message = driver.findElement(By.id("demo")).getText();
    }


    // Get Message
    public String getAlertMessage() {

        return message;
    }
}