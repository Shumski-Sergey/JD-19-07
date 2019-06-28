package inikalayeva.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String stringForNumber = buffer.readLine();
        int n = Integer.parseInt(stringForNumber);

        int[] numbersForTask = new int[n];

        for (int i = 0; i < n; i++) {
            stringForNumber = buffer.readLine();
            numbersForTask[i] = Integer.parseInt(stringForNumber);
            System.out.print(numbersForTask[i] + " ");
        }
        System.out.println("");

        int count = 0;
        int number = 0;
        int temporaryCount = 0;
        for (int i = 1; i < n; i++){

            for (int k = 0; k < i; k++){
                if (numbersForTask[i] == numbersForTask[k]);
                temporaryCount++;
            }
            if (temporaryCount > count){
                count = temporaryCount;
                number = numbersForTask[i];
            }
            temporaryCount = 0;
        }
        System.out.println(number);

    }
}
