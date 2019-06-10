package dmbelov.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1 {
    public static void main(String[] args) throws IOException {

     System.out.print("Введите предолжение со знаками припенания: ");
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     String sentence = reader.readLine();

     Pattern p = Pattern.compile("[,.!?;:-]");
     Matcher matcher = p.matcher(sentence);

     int match = 0;
     while (matcher.find()) {
        match++;
     }
     System.out.print(match);
    }
}

