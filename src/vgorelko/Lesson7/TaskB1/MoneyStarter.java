package vgorelko.Lesson7.TaskB1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyStarter {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Ввод рублей
        String rubT = reader.readLine();
        long rub = Long.valueOf(rubT);

        //Ввод копеек
        char arr [] = reader.readLine().toCharArray();
        String numText = "";
        for (int x = 0; x < arr.length; x++) {

            numText = numText + arr[x];

        }

        int num = Integer.parseInt(numText);

        char a = (char) 200;
        char b = (char) 187;
        System.out.println(a-b);

      //  char c = a + 0;

    //???????????
    }

}
