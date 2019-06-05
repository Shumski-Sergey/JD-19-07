package izhuk.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson3A7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int result = 1;
        for (int i = 1; i <= number; i++){
            result *= i;
        }
        System.out.println(result);
    }
}

