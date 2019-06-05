package izhuk.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson3A8 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= number; i++){
            if ( number % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
