package tests;


import org.testng.annotations.Test;
import base.BasePage;
import pages.NewTabPage;


public class NewTabTest extends BasePage {

    @Test
    public void newTabTest() throws InterruptedException  {

        

        NewTabPage nt = new NewTabPage(driver);

        nt.newTab();
        nt.childAction();

        
    }
}