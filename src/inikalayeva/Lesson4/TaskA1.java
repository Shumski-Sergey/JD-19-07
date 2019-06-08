package inikalayeva.Lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        int summary = 0;
        String someText = "There are; some !words";
        Pattern pattern = Pattern.compile("[\\?\\.!,:;]");
        Matcher matcher = pattern.matcher(someText);

        while (matcher.find()){
            summary++;
        }
        System.out.println(summary);
    }
}
