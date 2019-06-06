package rbondarovich.Lecture3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(r.readLine());
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
