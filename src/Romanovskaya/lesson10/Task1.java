package romanovskaya.lesson10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {

        final int inputs = 10;

        Set<Integer> intSet = new HashSet<>(10);
        Scanner sc = new Scanner(System.in);


        System.out.println("Пожалуйста, введите числа");


        for ( int i = 0; i < inputs; i++){
            intSet.add(sc.nextInt());
        }
        System.out.println("Список неповторяющихся чисел");
        System.out.println(intSet);

    }
}
