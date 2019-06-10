package dmbelov.Lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A3 {
    public static void main(String[] args) {

        String string1 = "Пожалуйста, не волнуйтесь - ";
        String string2 = "будьте счастливы!!!";
        StringBuilder str = new StringBuilder();
        str.append(string1).append(string2);

        Pattern pattern = Pattern.compile("[а-яА-Я](?=[ .,-:;!?])");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }
}
