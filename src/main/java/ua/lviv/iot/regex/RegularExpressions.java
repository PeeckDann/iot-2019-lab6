package ua.lviv.iot.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void deleteText(final String textToEdit) {
        String patternString = "[ \\w\\s{0,1}(\\-|\\;|\\,)* ]*three random words[ \\w\\s{0,1}(\\-|\\;|\\,)* ]*\\?";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(textToEdit);
        System.out.println(matcher.replaceAll(""));
    }
}