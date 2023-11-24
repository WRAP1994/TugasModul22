package helper;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;

public class utility {
    public static File getJSONSchemaFile(String JSONFile) {
        return new File("src/test/java/helper/JSONSchemaData/" + JSONFile);
    }

    public static String generateEmail(){
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "-_.";
        String email = "";
        String temp = RandomStringUtils.randomAlphanumeric(8);
        email =temp + "@Testing.com";
        return email;
    }
}
