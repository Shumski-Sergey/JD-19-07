package romanovskaya.lesson10;

import java.util.HashMap;
import java.util.Map;

public class Task2letters {

    public static void main(String[] args) {

        String[] arr = {"hello", "world", "how are you", "hello", "hello", "world"};
        System.out.println(countSame(arr));
    }

    public static <T> Map<T, Integer> countSame(T[] arr) {
        Map<T, Integer> map = new HashMap<>();
        Integer count;

        for (T i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                count = 0;
                for (T j : arr) {
                    if (j.equals(i)) {
                        count++;
                    }
                }
                map.remove(i);
                map.put(i, count);
            }
        }
        return map;
    }
}
