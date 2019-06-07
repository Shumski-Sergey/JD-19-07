package inikalayeva.Lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TaskA2 {

    public static void main(String[] args){
        String someText = " There are; some !words";
        int count = 0;
        Pattern firstChar  = Pattern.compile(" ");
        Matcher firstCharMatcher = firstChar.matcher(someText);
        if (firstCharMatcher.lookingAt() == false){
            count++;
        }
        Pattern pattern = Pattern.compile("[\\s\\?\\.!,:;]\\w");
        Matcher matcher = pattern.matcher(someText);
        while (matcher.find()){
            count++;
        }
        System.out.println(count);

    }
}
