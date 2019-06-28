package src.inikalayeva.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class A1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String theLine = reader.readLine();
        giveMeUniqueElement(theLine);
        for (Integer key : forNumbers.keySet()){
            System.out.println(key);
        }

    }

    private static HashMap<Integer, String> forNumbers = new HashMap<>();
    private static void giveMeUniqueElement(String theLine) {
        for (int i = 0; i < theLine.length(); i++ ){
            char c = theLine.charAt(i);
            if (Character.isDigit(c)){
                int num = Character.getNumericValue(c);
                forNumbers.put(num, "value");
            }
        }
    }

}
