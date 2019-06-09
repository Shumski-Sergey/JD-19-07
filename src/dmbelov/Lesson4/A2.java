package dmbelov.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A2 {
    public static void main(String[] args) throws IOException {

        System.out.print("Введите текст: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();

        Pattern pattern = Pattern.compile("[а-яА-Я]+");
        Matcher matcher = pattern.matcher(sentence);

        int match = 0;
        while (matcher.find()) {
            match++;
        }

        System.out.print(match);
    }
}
