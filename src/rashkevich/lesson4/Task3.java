package rashkevich.lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args){
        String text="Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой ";
        Pattern pattern=Pattern.compile("(\\s)+|(\\,\\s)+");
        String[] words=pattern.split(text);
        for (String str:words){
            char chars[]=str.toCharArray();
            //System.out.println(str);
        System.out.print(chars[(chars.length-1)]);

        }
    }
}
