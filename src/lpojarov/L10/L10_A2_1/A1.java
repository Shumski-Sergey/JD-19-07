package lpojarov.L10.L10_A2_1;

import java.util.HashMap;
class RepeatedElements {

    public static <T> HashMap<T, Integer> findSameEl(T[] array) {
        Integer counter;
        HashMap<T, Integer> list = new HashMap<T, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (!list.containsKey(array[i])) {
                counter = 1;
                for (int j = 0; j < array.length; j++)
                    if (array[i].equals(array[j]) && i != j)
                        counter++;
                list.put(array[i], counter);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Integer[] i = {1,1,2,22, 2, 5, 4, 5, 4, 3, 2, 1};
        System.out.println(findSameEl(i));
    }
}
