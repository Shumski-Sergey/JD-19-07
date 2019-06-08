package inikalayeva.Lesson4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB3 {
    public static void main(String[] args){
        ArrayList <String> imAngry = new ArrayList<>();
        Pattern pattern = Pattern.compile("https?:\\/\\/[a-z0-9]+\\.[a-z]+\\/?");
        Matcher matcher = pattern.matcher("This string contains http://fcknsite.com and https://anotherfcknsite.lt");
        while (matcher.find()){
            imAngry.add(matcher.group());
            imAngry.add(" ");
        }

        for (int i = 0; i < imAngry.size(); i++){
            System.out.print(imAngry.get(i));
        }
    }
}
