package ikalnaus;

import java.util.Scanner;

public class TaskA8 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите натуральное число n:");
        int num = in.nextInt();
        System.out.println("Число " + num + " имеет следующие положительные делители: ");
        for (int i=1; i<=num ;i++){
            if (num%i==0){
                System.out.println(i);
            }
        }
        in.close();


    }
}
