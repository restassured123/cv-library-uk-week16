package uk.co.library;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.testng.Assert;
import uk.co.library.propertyreader.PropertyReader;
import uk.co.library.utilities.Utility;

public class Hooks extends Utility {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    @After
    public void tearDown(){
        closeBrowser();

    }
    public void verifyTwoStrings(By by, String text){
        String expected =text;
        String actual = getTextFromElement(by);
        Assert.assertEquals(actual,expected);
    }
}
