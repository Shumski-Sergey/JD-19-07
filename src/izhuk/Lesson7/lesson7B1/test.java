package src.izhuk.Lesson7.lesson7B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double number = Double.parseDouble(reader.readLine());
        long rubles = Long.parseLong(reader.readLine());
        byte coins = Byte.parseByte(reader.readLine());

        summ(number, rubles, coins);
        min(number, rubles, coins);
        div(number, rubles, coins);
        mult(number, rubles, coins);
        compare(number, rubles, coins);
    }

    public static void summ(double a, long b, byte c) {
        double numb = b + (c * 0.01);
        double summ = numb + a;
        int rubl = (int) summ;
        double coin = (summ * 100) % 100;
        System.out.println(rubl + "," + (byte) coin);
    }

    public static void min(double a, long b, byte c) {
        double numb = b + (c * 0.01);
        double min = numb - a;
        int rubl = (int) min;
        double coin = (min * 100) % 100;
        System.out.println(rubl + "," + (byte) coin);
    }

    public static void div(double a, long b, byte c) {
        double numb = b + (c * 0.01);
        double div = numb / a;
        int rubl = (int) div;
        double coin = (div * 100) % 100;
        System.out.println(rubl + "," + (byte) coin);
    }

    public static void mult(double a, long b, byte c) {
        double numb = b + (c * 0.01);
        double mult = numb * a;
        int rubl = (int) mult;
        double coin = (mult * 100) % 100;
        System.out.println(rubl + "," + (byte) coin);
    }

    public static void compare(double a, long b, byte c) {
        double numb = b + (c * 0.01);
        if (numb > a) {
            System.out.println(b + "," + c + " > чем число " + a);
        } else {
            System.out.println("Число" + a + " > чем " + b + "," + c);
        }

    }
}
