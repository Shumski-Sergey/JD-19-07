package izhuk.Streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StreamsA2 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\Java lessons\\JD-19-07\\words1.txt");
        FileInputStream input = new FileInputStream(file);
        FileOutputStream output = new FileOutputStream("F:\\Java lessons\\JD-19-07\\words2.txt");

        byte[] words = new byte[input.available()];

        while (input.available() > 0)
        {
            input.read(words);
        }

        String text = new String(words);

        for (String lines : text.split("\\s"))
        {
            Pattern pattern = Pattern.compile("^[0-9]+$");
            Matcher matcher = pattern.matcher(lines);
            if (matcher.find())
            {
                output.write(lines.getBytes());
                output.write(' ');
            }
        }

        input.close();
        output.close();
    }
}
