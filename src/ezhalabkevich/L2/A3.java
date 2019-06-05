package ezhalabkevich.L2;

import java.util.Random;

public class A3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a=rand.nextInt(20);
        int b = rand.nextInt(20);
        int c = rand.nextInt(20);
        System.out.println("Первоначальная последовательность "+a+" "+b+" "+c);
        int n=0;
        if (a > b) {
            n = a;
            a = b;     //b max(a,b)
            b = n;
        }
        if (b > c) {
            n = b;   //c max(b,c)
            b = c;
            c = n;
        }

        if (a > b) {
            n = a;
            a = b;     //b max(a,b)
            b = n;
        }

        System.out.println("Последовательность чисел по возрастанию: " + a + ", " + b + ", " + c);
    }
}
