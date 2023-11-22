package Stepdef;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class baseTest {
    protected static WebDriver driver;
    public static Response res;
    protected void starDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

    public static File getJsonSchemaData(String JSONFile){
        return new File("src/test/java/JsonSchema/" + JSONFile);
    }

    public static String generateEmail(){
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "-_.";
        String email = "";
        String temp = RandomStringUtils.randomAlphanumeric(8);
        email =temp + "@Testing.com";
        return email;
    }
}
