package src.izhuk.Lesson5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class lesson5A3 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        ArrayList<String> array = new ArrayList<String>();
        int LineNumbers = 0;
        int AverageLength = 0;
        while (!str.equals("")) {
            array.add(str);
            str = reader.readLine();
            AverageLength += array.get(LineNumbers).length();
            LineNumbers++;
        }

        AverageLength = AverageLength/LineNumbers;

        System.out.println("Средняя длина : " + AverageLength);
        for (int i = 0; i < LineNumbers; i++) {
            if (array.get(i).length () < AverageLength)
                System.out.println ("Строка: " + array.get(i) + ". Ее длина: " + array.get(i).length ());
        }
    }
}


