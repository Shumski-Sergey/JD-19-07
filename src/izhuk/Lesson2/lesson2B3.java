package izhuk.Lesson2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lesson2B3 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int sum = 0;
        if (a >= 0){
            while (a != 0){
                sum += a;
                a--;
            }
            System.out.println(sum);
        }
        else {
            System.out.println("Введите положительное число!");
        }
    }
}
