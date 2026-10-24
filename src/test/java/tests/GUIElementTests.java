package tests;

import java.io.IOException;


import org.testng.annotations.Test;

import base.BasePage;
import pages.GUIElementPage;
import utils.ConfigReader;


public class GUIElementTests extends BasePage {

    @Test
    public void detailsTest() throws IOException {
    	
    	ConfigReader config = new ConfigReader();
        GUIElementPage gui=new GUIElementPage(driver);
        gui.details(config.getProperty("name"),
                    config.getProperty("email"),
                    config.getProperty("phone"),
                    config.getProperty("address"));
    }}
        

        
               
                
