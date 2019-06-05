package vgorelko.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TaskB1 {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите число!");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();

        char[] arr = num1.toCharArray();

        String[] text = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {

            text[i] = String.valueOf(arr[i]);

        }

        String[] textD = new String[arr.length-1];

        if ( String.valueOf(arr[0]).equals("-") ) {

            System.out.print("-");

            for (int i = 1; i < arr.length; i++) {

                textD[i-1] = String.valueOf(arr[i]);

            }

            text = textD;

        }


        if (text.length%3 == 0) {

            for (int i = 0; i < text.length; i = i + 3) {

                System.out.print(text[i] + "" + text[i + 1] + "" + text[i + 2] + " ");

            }
        }

        String [] text2 = new String[text.length+1];
        String [] text3 = new String[text.length+2];
        text2[0] = "";
        text3[0] = "";
        text3[1] = "";

        if (text.length%3 != 0) {

            if (text.length%3 == 1) {

                for (int i = 2; i < text3.length; i++) {

                    text3[i] = text[i-2];

                }

                for (int i = 0; i < text3.length; i = i + 3) {

                    System.out.print(text3[i] + "" + text3[i + 1] + "" + text3[i + 2] + " ");

                }
            }


            if (text.length%3 == 2) {

                for (int i = 1; i < text2.length; i++) {

                    text2[i] = text[i-1];

                }

                for (int i = 0; i < text2.length; i = i + 3) {

                    System.out.print(text2[i] + "" + text2[i + 1] + "" + text2[i + 2] + " ");

                }
            }
        }

    }

}