package tolifer.L4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class zad2 {
    public static void main (String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String newS = s.trim();
        //System.out.println(newS);
        String [] text = newS.split("\\s+");
        int count = text.length;
        System.out.println(count);


    }
}
