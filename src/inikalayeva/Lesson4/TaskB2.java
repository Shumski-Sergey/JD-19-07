package inikalayeva.Lesson4;

import java.util.ArrayList;

public class TaskB2 {
    public static void main (String[] args){
        String someText = "abc ad eeeh zwra cd ";
        char[] charSomeText = someText.toCharArray();
        ArrayList lastLetters = new ArrayList();
        int count = 0;
        for (int i = 0; i < charSomeText.length - 2; i++){
            if (charSomeText[i + 1] == ' '){
                if (charSomeText[i] < charSomeText[i + 2]){
                    lastLetters.add(charSomeText[i]);
                    count++;
                } else {
                    if (count > 0){
                        lastLetters.add(charSomeText[i]);
                        lastLetters.add(',');
                        lastLetters.add(' ');
                        count = 0;
                    }
                }
            } else if (charSomeText[i] < charSomeText[i + 1]){
                if (charSomeText[i] == ' '){
                    continue;
                } else {
                    lastLetters.add(charSomeText[i]);
                    count++;
                }
            } else {
                if (count > 0) {
                    lastLetters.add(charSomeText[i]);
                    lastLetters.add(',');
                    lastLetters.add(' ');
                    count = 0;
                }
            }
        }
        if (charSomeText[charSomeText.length - 3] < charSomeText[charSomeText.length - 2]){
            lastLetters.add(charSomeText[charSomeText.length - 2]);
        }

        if (charSomeText[charSomeText.length - 2] < charSomeText[charSomeText.length - 1]){
            lastLetters.add(charSomeText[charSomeText.length - 1]);
        }


        for (int i = 0; i < lastLetters.size(); i++){
            System.out.print(lastLetters.get(i));
        }
    }
}
