package ezhalabkevich.L5;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
а среди них – количество слов с равным числом гласных и согласных букв. */
public class Task5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите кол-во строк");
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String index = bufferedReader.readLine();
        int n = Integer.parseInt(index); //знаем кол-во строк, создадим массив строк
        String[] lines = new String[n]; //объявили массив строк
        System.out.println("Введите строки");
        for (int i = 0; i < n; i++) {
            System.out.println("Строка " + (i + 1));
            lines[i] = bufferedReader.readLine(); //заполнение массива строками
        }

        Pattern p = Pattern.compile("[a-zA-z]");
        for (int i = 0; i < n; i++) {
            Matcher m = p.matcher(lines[i]);
            if (m.find()) {
                letter(lines[i]);
            }
        }


    }

    public static void letter(String str) {
        int len = str.length();
        int count = 0;
        if (len % 2 == 0) {  //если колво букв четное, то есть вероятность что гласные = согласным

            for (int i = 0; i < len; i++) {   //гласных всего 5, но нужно учесть регистр
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                        str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' ||
                        str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                    count++;
                }
            }
            if (count == len - count) {
                System.out.println("В слове количество гласных и согласных совпадают! " + str);
            }
        }
    }
}
