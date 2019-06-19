package inikalayeva.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String stringForNumber = buffer.readLine();
        int n = Integer.parseInt(stringForNumber);

        int[] numbersForTask = new int[n];

        for (int i = 0; i < n; i++) {
            numbersForTask[i] = (int) (Math.random() * 100);
            System.out.print(numbersForTask[i] + " ");
        }
        System.out.println("");

        int maxNumber = numbersForTask[0];
        int minNumber = numbersForTask[0];
        int maxIndex = 0;
        int minIndex = 0;
        int sum = 0;
        for (int j = 1; j < numbersForTask.length; j++) {
            if (numbersForTask[j] < minNumber) {
                minNumber = numbersForTask[j];
                minIndex = j;
            } else if (numbersForTask[j] > maxNumber) {
                maxNumber = numbersForTask[j];
                minIndex = j;
            }
        }
        for (int i = 0; i < n; i++){
            if (i != maxIndex && i != minIndex){
                sum += numbersForTask[i];
            }
        }



            System.out.println("The biggest number is " + maxNumber);
            System.out.println("The smallest number is " + minNumber);
            System.out.println("Sum of other numbers is " + sum);

        }
    }

