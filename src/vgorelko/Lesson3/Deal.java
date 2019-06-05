package vgorelko.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Deal {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество игроков");

        String num1 = reader.readLine();

        int numGamer = Integer.parseInt(num1);


        String arr1 [] = {"2 diamonds", "3 diamonds", "4 diamonds", "5 diamonds", "6 diamonds", "7 diamonds", "8 diamonds", "9 diamonds", "10 diamonds", "jack diamonds", "queen diamonds", "king diamonds", "ace diamonds", "2 hearts", "3 hearts", "4 hearts", "5 hearts", "6 hearts", "7 hearts", "8 hearts", "9 hearts", "10 hearts", "jack hearts", "queen hearts", "king hearts", "ace hearts", "2 spades", "3 spades", "4 spades", "5 spades", "6 spades", "7 spades", "8 spades", "9 spades", "10 spades", "jack spades", "queen spades", "king spades", "ace spades", "2 clubs", "3 clubs", "4 clubs", "5 clubs", "6 clubs", "7 clubs", "8 clubs", "9 clubs", "10 clubs", "jack clubs", "queen clubs", "king clubs", "ace clubs", "black Joker", "red Joker"};


        int index;
        String temp;
        Random random = new Random();
        for (int i = arr1.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = arr1[index];
            arr1[index] = arr1[i];
            arr1[i] = temp;
        }

        int b = 1;
        int a;
        for (int i = 1; i <= numGamer; i++) {

            System.out.print("Игрок " + i + " имеет мледующий список карт: " );
            int c = 0;
            for ( a = b; a <= arr1.length; a++) {

                c++;

                System.out.print(arr1[a] + " ");

                if (c == 5) break;

            }

            System.out.println();
            System.out.println();

            b = a;

        }


    }


}