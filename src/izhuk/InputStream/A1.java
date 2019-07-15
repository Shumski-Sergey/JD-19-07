package src.izhuk.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class A1 {
    public static void main(String[] args) {
        int b;
        List<Byte> list = new ArrayList<>();
        FileInputStream input = null;
        try {
            input = new FileInputStream("F:\\\\Java lessons\\\\JD-19-07\\\\src\\\\izhuk\\\\InputStream\\\\A1.txt");
            while ((b = input.read()) != -1) {
                list.add((byte) b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Map<Byte, Integer> count = new HashMap<Byte, Integer>();

        for (Byte item : list) {
            if (count.containsKey(item)) {
                count.put(item, count.get(item) + 1);
            } else {
                count.put(item, 1);
            }
        }

        int maxValueInMap = (Collections.max(count.values()));

        for (Map.Entry entry : count.entrySet()) {
            if (entry.getValue().equals(maxValueInMap)) {
                System.out.println("Наиболее повторяющийся/щиеся " + entry.getKey() + " с количеством повторов " + entry.getValue());
            }
        }


    }
}

