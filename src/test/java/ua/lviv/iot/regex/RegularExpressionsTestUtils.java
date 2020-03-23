package ua.lviv.iot.regex;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegularExpressionsTestUtils {

    @Test
    public void test() {

        String yourText = "The expectations for first. Grade have - changed three random words due to the Common, Core Standards? Curriculum is typically based on state standards developed.";
        InputStream input = new ByteArrayInputStream(yourText.getBytes());
        System.setIn(input);

        @SuppressWarnings("resource")
        Scanner myScanner = new Scanner(System.in);
        String textToEdit = myScanner.nextLine();
        System.out.println(textToEdit);
        RegularExpressions.deleteText(textToEdit);
    }
}