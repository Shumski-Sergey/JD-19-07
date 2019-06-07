package rbondarovich.Lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(r.readLine());

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) System.out.print(i + " ");
        }
    }
}
