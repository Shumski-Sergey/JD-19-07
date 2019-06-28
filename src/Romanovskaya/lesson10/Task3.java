package romanovskaya.lesson10;

import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваши слова через пробел:");
        String text = in.nextLine();
        text = text.toLowerCase();

        String[] words = text.split(" ");

        Map<String, String> map = new HashMap<String, String>();
        for ( int i = 0; i <words.length; i++){
            String tmpWord = words[i];
            char[] sym = words[i].toCharArray();

            Arrays.sort(sym);

            String wordkey = new String(sym);
            String value = map.get(wordkey);
            if ( value == null){
                map.put(wordkey, tmpWord);
            }
            else{
                map.put(wordkey, value + " " + tmpWord);
            }
        }
        System.out.println();
        for ( String k2 : map.values()){
            System.out.println(k2);
        }
    }
}
