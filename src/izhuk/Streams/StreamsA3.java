package izhuk.Streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsA3 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\Java lessons\\JD-19-07\\world.txt");
        FileInputStream reader = new FileInputStream(file);
        String str = "";

        for (;;){
            int code = reader.read();
            if (code < 0){
                break;
            }
            else {
                str += (char)code;
            }
        }
        String[] array = str.split("\\s*[,.!?]\\s*");

        Stream<String> lineStream;
        long count = Arrays.stream(array).filter(x -> x.contains("world")).count();
        System.out.println(count);
        reader.close();
    }
}
