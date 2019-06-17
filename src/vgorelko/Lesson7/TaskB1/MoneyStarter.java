package vgorelko.Lesson7.TaskB1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyStarter {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String textForChar = reader.readLine();

        char arr [] = textForChar.toCharArray();
        System.out.println(arr);

    //???????????
    }

}
