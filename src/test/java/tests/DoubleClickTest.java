package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BasePage;
import pages.DoubleClickPage;
import utils.ConfigReader;

public class DoubleClickTest extends BasePage {

    @Test
    public void ddclick() throws Exception  {

    	ConfigReader config = new ConfigReader();
    	
        DoubleClickPage dd = new DoubleClickPage(driver);

        dd.doubleClick();
        
        String actual=dd.getDoubleClick();
        String expected=config.getProperty("DoubleCliCkMessage");
        Assert.assertEquals(actual, expected);
        

        
    }
}