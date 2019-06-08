package inikalayeva.Lesson5.SforStrings;
// 1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String toN = reader.readLine();
        int n = Integer.parseInt(toN);


        String[] someStrings = new String[n];
        for (int i = 0; i < n; i++){
            someStrings[i] = reader.readLine();
        }
        int maxIndex = 0;
        int maxLength = someStrings[0].length();
        int minIndex = 0;
        int minLength = someStrings[0].length();

        for (int i = 1; i < someStrings.length; i++){
            if (someStrings[i].length() < minLength){
                minLength = someStrings[i].length();
                minIndex = i;
                continue;
            }
            if (someStrings[i].length() > maxLength){
                maxLength = someStrings[i].length();
                maxIndex = i;
            }

        }

        System.out.println("Index of the longest string is " + maxIndex + " and length is" + maxLength);
        System.out.println("Index of the shortest syring is " + minIndex + " and length is " + minLength);


    }
}
