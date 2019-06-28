package romanovskaya.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    // Посчитать количество знаков препинания

    public static void main(String[] args) throws IOException{

        int number = 0;
        System.out.println("Введите ваше предложение:");

        // ввод текста с консоли

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Поиск знаков препинания

        Pattern pattern = Pattern.compile("[!?.,:;-]");
        Matcher matcher = pattern.matcher(reader.readLine());

        // подсчет количества знаков

        while (matcher.find()){
             number++;
        }
        System.out.println("Количество знаков препинания:" + " " + number);
    }
}

