package izhuk.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lesson5A2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число строк:");
        int n = Integer.parseInt(reader.readLine());
        String[] array = new String[n];
        for (int i = 0; i < n; i++){
            String str = reader.readLine();
            array[i] = str;
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j].length() > array[j + 1].length()){
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for(String str : array){
            System.out.println(str);
        }
    }
}
