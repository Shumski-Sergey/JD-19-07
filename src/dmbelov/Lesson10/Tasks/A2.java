package dmbelov.Lesson10.Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class A2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 5, 1, 2, 2, 3};
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i: array) {
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else {
                map.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println("Number " + m.getKey() + " repeats " + m.getValue() + " times.");
        }
    }
}