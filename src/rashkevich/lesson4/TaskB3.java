package rashkevich.lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB3 {
    public static void main(String[] args){
        String str=" https://example.com/   example.com   кремль.рф  http://tut.by ";
        String regex="http(s)*://([a-z])+.([a-z])+(/)*";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
