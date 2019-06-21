package dmbelov.Lesson10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1, 2, 3, 4, 4 ,5");

        Pattern p = Pattern.compile("[1-9]");
        Matcher m = p.matcher(list.get(0));

        ArrayList<Integer> listInt = new ArrayList<>();
        while(m.find()){
            Integer tmp = Integer.parseInt(m.group());
            listInt.add(tmp);
        }

        Set<Integer> set = new HashSet<>(listInt);
        System.out.print(set);
    }
}
