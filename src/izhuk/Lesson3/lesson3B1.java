package izhuk.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson3B1 {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        number = number.substring(0, number.length()-3) + " " + number.substring(number.length()- 3);
        for (int i = 0; i < number.length()/ 3; i++) {
            int lastSpace = number.indexOf(" ");
            if((lastSpace - 3) > 0) {
                number = number.substring(0, lastSpace- 3) + " " + number.substring(lastSpace - 3);
            }
            else {
                break;
            }
        }
        System.out.println(number);
    }
}
