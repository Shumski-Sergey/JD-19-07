package tolifer.L4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad1 {
    public static void main (String [] args) throws IOException {

        int count = 0;
        Pattern pattern = Pattern.compile("[!?.,:;-]");

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Matcher matcher = pattern.matcher(read.readLine());
        while (matcher.find()){
            count++;
        }

        System.out.println(count);
    }

}
