package rashkevich.lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args){
        String text="Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой ";
        Pattern p= Pattern.compile("(\\s*)([0-9А-Яа-я]+)(\\s|\\.\\!)*");
        Matcher m=p.matcher(text);
        int count=0;
        while(m.find()){
            count++;
        }
        System.out.println(count);
    }
}
