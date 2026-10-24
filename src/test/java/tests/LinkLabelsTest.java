package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;
import pages.LinkLabelsPage;
import utils.ConfigReader;

public class LinkLabelsTest extends BasePage {

    @Test
    public void bl() throws Exception {
    	ConfigReader config = new ConfigReader();

        LinkLabelsPage bp = new LinkLabelsPage(driver);

        bp.brokenLink();
        int actual=bp.getBrokenCount();
        int expected=Integer.parseInt(config.getProperty("BrokenExpectedResult"));
        Assert.assertEquals(actual,expected);
        
    }
}