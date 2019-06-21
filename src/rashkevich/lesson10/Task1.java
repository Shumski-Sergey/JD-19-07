package rashkevich.lesson10;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Task1 {
    public static void main(String...s){
        System.out.println("Введите 6 чисел:");
        LinkedHashSet<Integer> set=new LinkedHashSet();
        for (int i=0;i<6;i++){
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            set.add(num);
        }
        System.out.println("-------");
        for (Integer n:set){
            System.out.println(n);
        }
    }
}
