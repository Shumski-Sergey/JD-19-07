package lpojarov.L10.A2_2;
import java.util.HashMap;
import java.util.Map;

public class A2_2 <E> {
    private Map<E, Integer> map = new HashMap<E, Integer>();

    public A2_2(E [] array) {
        for (E elem : array) {
            map.put(elem, map.containsKey(elem) ? map.get(elem)+1 : 1);
        }
    }

    public Integer getCount(E elem) {
        return map.get(elem);
    }
}