package rbondarovich.l4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[.{1},!?\\-:;]");
        Matcher m = p.matcher("Меня Зовут Альбус. Я, лю:;блю, - использовать? знаки препинания! где угод,но");
        int count = 0;
        while (m.find()){
            count++;
        }
        System.out.println(count);
    }
}
