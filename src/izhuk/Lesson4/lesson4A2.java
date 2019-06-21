package src.izhuk.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lesson4A2 {

    public static void main(String[] args) throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sentence = reader.readLine();

            Pattern pattern = Pattern.compile("(\\s*)([0-9А-Яа-я]+)(\\s\\.\\!\\?)*");
            Matcher matcher = pattern.matcher(sentence );

            int count = 0;
            while(matcher.find()){
                count++;
            }
            System.out.println(count);
        }
    }
