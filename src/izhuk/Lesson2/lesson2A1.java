package izhuk.Lesson2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lesson2A1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double M = Double.parseDouble(reader.readLine());
        double N = Double.parseDouble(reader.readLine());

        if ((10 - Math.abs(M)) < (10 - Math.abs(N))) {
            System.out.println(M);
        } else {
            System.out.println(N);
        }
    }
}
