package vgorelko.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class TaskA3 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();

        int [] arr1 = new int[3];
        arr1[0] = Integer.parseInt(a1);
        arr1[1] = Integer.parseInt(b1);
        arr1[2] = Integer.parseInt(c1);;


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] <= arr1[j]) {
                    int x = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = x;
                }
            }
        }

        System.out.println(Arrays.toString(arr1));



    }

}
