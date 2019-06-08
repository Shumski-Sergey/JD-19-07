package inikalayeva.Lesson4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA3 {
    public static void main(String[] args){
        String someText = "Lets take last letter from every word";
        char[] charSomeText = someText.toCharArray();
        ArrayList lastWord = new ArrayList();
        for (int i = 0; i < charSomeText.length - 1; i++){
            if (charSomeText[i + 1] == ' '){
                lastWord.add(charSomeText[i]);
            }
        }
        if (charSomeText[charSomeText.length - 1] != ' '){
            lastWord.add(charSomeText[charSomeText.length - 1]);
        }

        for (int i = 0; i < lastWord.size(); i++){
            System.out.print(lastWord.get(i));
        }
    }
}
