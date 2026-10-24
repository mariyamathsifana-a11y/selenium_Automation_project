package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;
import pages.MouseHoverPage;
import utils.ConfigReader;

public class MouseHoverTest extends BasePage {

    @Test
    public void MH() throws IOException {

        ConfigReader config = new ConfigReader();

        MouseHoverPage mh = new MouseHoverPage(driver);

        mh.Mousehover();

        String actualMobile = mh.getMobileText();
        String expectedMobile = config.getProperty("Mobile");

        Assert.assertEquals(actualMobile, expectedMobile);

        String actualLaptop = mh.getLaptopText();
        String expectedLaptop = config.getProperty("Laptop");

        Assert.assertEquals(actualLaptop, expectedLaptop);
    }
}