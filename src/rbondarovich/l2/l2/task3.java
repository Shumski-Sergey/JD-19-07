package rbondarovich.l2.l2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;



public class task3 {
    public static void sort(double a, double b, double c) {
//            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//            int A = Integer.parseInt(r.readLine());
//            int B = Integer.parseInt(r.readLine());
//            int C = Integer.parseInt(r.readLine());
        int[] arr = {(int) a, (int) b, (int) c};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
