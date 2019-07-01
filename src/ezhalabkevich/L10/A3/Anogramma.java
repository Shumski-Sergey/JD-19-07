package ezhalabkevich.L10.A3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anogramma {
    public static void main(String[] args) {
        //String str="123 456 231 546 231 312 4556";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слова через пробел: ");
        String   text = in.nextLine();    // cчитываем одну строку целиком
        String[] words = text.split(" "); // переводим строку в массив строк

        Map<String, String> map = new HashMap<String,String>();
        for(int i = 0; i <= words.length - 1; i++){
            String tmpWord = words[i]; // присваиваем в t слово из массива
            char [] sym = words[i].toCharArray(); // преобразуем элемент массива в набор символов

            Arrays.sort(sym); // сортируем массив по возрастанию т.е. на
            // входе получаем 321 на выходе получаем 123

            String wordkey = new String(sym); // преобразуем массив символов в строку

            String value = map.get(wordkey);
            if(value == null){
                map.put(wordkey, tmpWord );
            }else{
                map.put(wordkey, value + " " + tmpWord);
            }
        }
        System.out.println();
        for(String k2 : map.values()){
            System.out.println(k2);
        }
    }
    }

