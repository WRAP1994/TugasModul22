package Stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends baseTest {
    @Before
    public void beforeTest(){
        System.out.println("Before Test");
        starDriver();
    }
    @After
    public void afterTest(){
        System.out.println("After Test");
        driver.quit();
    }
}
