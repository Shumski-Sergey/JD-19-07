package inikalayeva.Lesson4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA3withPattern {
    public static void main(String[] args){
        String someText = "Lets take last letter from every word";
        ArrayList positions = new ArrayList();
        Pattern pattern = Pattern.compile("\\w\\s");
        Matcher matcher = pattern.matcher(someText);
        while (matcher.find()){
            positions.add(matcher.start());

        }
        ArrayList lastLetters = new ArrayList();
        for (int i = 0; i < positions.size(); i++){
            int j = (int) positions.get(i);
            lastLetters.add(someText.charAt(j));
        }
        if (someText.charAt(someText.length() - 1) != ' '){
            lastLetters.add(someText.charAt(someText.length() - 1));
        }
        for (int i = 0; i < lastLetters.size(); i++){
            System.out.print(lastLetters.get(i));
        }
    }
}
