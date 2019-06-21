package src.izhuk.Lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lesson4A1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int sum = 0;
        Pattern pattern = Pattern.compile("[\\p{Punct}]");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            sum++;
        }
        System.out.println(sum);
    }
}
