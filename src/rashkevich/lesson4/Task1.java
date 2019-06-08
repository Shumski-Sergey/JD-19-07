package rashkevich.lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args){
        String str=" , , , .  . !???";
        Pattern p= Pattern.compile("\\.|\\,|\\!|\\?");
        Matcher m=p.matcher(str);
        int count=0;
        while(m.find()){
            count++;
        }
        System.out.println(count);
    }
}
