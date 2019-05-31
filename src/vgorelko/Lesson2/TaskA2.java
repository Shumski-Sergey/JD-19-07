package vgorelko.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();

        double a, b, c;
        double x1, x2;
        a = Double.parseDouble(a1);
        b = Double.parseDouble(b1);
        c = Double.parseDouble(c1);

        double D = Math.pow(b, 2) - 4 * a * c;

        if (D < 0) {
            System.out.println("Корней нет");
            ;
        } else {

            x1 = (-b - Math.sqrt(D)) / 2 * a;
            x2 = (-b + Math.sqrt(D)) / 2 * a;

            System.out.println("Вещественные корни: " + x1 + " и " + x2);
        }


    }
    }




