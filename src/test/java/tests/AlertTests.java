package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;
import pages.AlertPages;
import utils.ConfigReader;

public class AlertTests extends BasePage {

    @Test(priority = 1)
    public void simpleAlert() throws IOException {

        ConfigReader config = new ConfigReader();

        AlertPages alert = new AlertPages(driver);

        alert.simpleAlert();

        String actual = alert.getAlertMessage();

        String expected = config.getProperty("simplealert");

        Assert.assertEquals(actual, expected);
    }


    @Test(priority = 2)
    public void confirmationOK() throws IOException {

        ConfigReader config = new ConfigReader();

        AlertPages alert = new AlertPages(driver);

        alert.confirmationAlertOK();

        String actual = alert.getAlertMessage();

        String expected = config.getProperty("ConfirmOK");

        Assert.assertEquals(actual, expected);
    }


    @Test(priority = 3)
    public void confirmationCancel() throws IOException {

        ConfigReader config = new ConfigReader();

        AlertPages alert = new AlertPages(driver);

        alert.confirmationAlertCancel();

        String actual = alert.getAlertMessage();

        String expected = config.getProperty("ConfirmCancel");

        Assert.assertEquals(actual, expected);
    }


    @Test(priority = 4)
    public void promptOK() throws IOException {

        ConfigReader config = new ConfigReader();

        AlertPages alert = new AlertPages(driver);

        alert.promptAlertOK(config.getProperty("Promptalert"));

        String actual = alert.getAlertMessage();

        String expected = config.getProperty("PromptOK");

        Assert.assertEquals(actual, expected);
    }


    @Test(priority = 5)
    public void promptCancel() throws IOException {

        ConfigReader config = new ConfigReader();

        AlertPages alert = new AlertPages(driver);

        alert.promptAlertCancel();

        String actual = alert.getAlertMessage();

        String expected = config.getProperty("PromptCancel");

        Assert.assertEquals(actual, expected);
    }
}