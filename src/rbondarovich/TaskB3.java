package rbondarovich;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskB3 {
    public static void main(String[] args) throws IOException {
        // 1. Как предупредить выход sum из области integer (при number = 185000 результат отрицательный);
        // 2. Как узнать сколько памяти тратится на каждый из способов решения.
        int number;
        int sum = 0;

        while (sum == 0) {
            System.out.print("Enter the number: ");
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

            try {
                number = Integer.parseInt(r.readLine());
                if (number <= 0) throw new NumberFormatException();

                // Option 1
                for (int i = 1; i <= number; i++) {
                    sum += i;
                }
                System.out.println("Sum of numbers: " + sum);

                // Option 2
                int sum2 = number * (number + 1) / 2;
                System.out.println("Sum of numbers v2: " + sum2);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect value. Please enter a positive integer");
            }
        }
    }
}
