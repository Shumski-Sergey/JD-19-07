package vgorelko.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB3 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String adress  = reader.readLine();

        Pattern pattern = Pattern.compile("https?:\\/\\/[a-z0-9]+\\.[a-z]+\\/?");
        Matcher matcher = pattern.matcher(adress);

        System.out.println(matcher.find());



    }

}
