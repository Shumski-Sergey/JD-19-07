package izhuk.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lesson5A1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        ArrayList<String> array = new ArrayList<String>();
        while (!str.equals("")) {
            array.add(str);
            str = reader.readLine();
        }

        int min = array.get(0).length();
        int max = array.get(0).length();

        for (String line : array) {
            if (line.length() > max)
                max = line.length();
        }
        for (String lineMAX : array) {
            if (lineMAX.length() == max)
                System.out.println("Сама я большая строка: " + lineMAX + ". Ее длина : " + max);
        }
        for (String lineMIN : array) {
            if (lineMIN.length() < min)
                min = lineMIN.length();
        }
        for (String lineMIN : array) {
            if (lineMIN.length() == min)
                System.out.println("Сама я маленькая строка: " + lineMIN + ". Ее длина : " + min);
        }
    }
}