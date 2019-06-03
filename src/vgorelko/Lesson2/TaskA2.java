package vgorelko.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double a, b, c;
        double x1, x2;

        a = Double.parseDouble(reader.readLine());
        b = Double.parseDouble(reader.readLine());
        c = Double.parseDouble(reader.readLine());

        double D = Math.pow(b, 2) - 4 * a * c;

        if (D < 0) {
            System.out.println("Корней нет");

        } else {

            x1 = (-b - Math.sqrt(D)) / 2 * a;
            x2 = (-b + Math.sqrt(D)) / 2 * a;

            if (x1 == x2) {
                System.out.println("Вещественный корень равен " + x1);
            } else {
                System.out.println("Вещественные корни: " + x1 + " и " + x2);
            }

        }
    }
    }




