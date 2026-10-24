package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BasePage;
import pages.DragAndDropPage;

import utils.ConfigReader;

public class DragAndDropTest extends BasePage {

    @Test
    public void drag() throws  Exception {

    	ConfigReader config = new ConfigReader();
        DragAndDropPage dd = new DragAndDropPage(driver);

        dd.dragAndDrop();
        
        String actual=dd.getDropMessage();
        String expected=config.getProperty("DragandDrop");
        Assert.assertEquals(actual,expected);
        

        
        
    }
}