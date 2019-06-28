package src.inikalayeva.Lesson8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[10];
        ArrayList myList = new ArrayList();
        for (int i = 0; i < arr.length; i++){
            arr[i] = reader.readLine();
        }

        for(int i = 0; i < arr.length; i++){
            myList.add(arr[i]);
        }

        for (int i = 0; i < 5; i++){
            System.out.println(myList.get(i));
        }

    }
}
