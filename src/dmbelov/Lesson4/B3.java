package dmbelov.Lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B3 {
    public static void main(String[] args) {

        String string = "http://example.com";

        Pattern pattern = Pattern.compile("^((http|https)(://)[a-zA-Z0-9.-]+)$");
        Matcher matcher = pattern.matcher(string);

        while(matcher.find()) {
            System.out.println(string.substring(matcher.start(), matcher.end()));
        }
    }
}
