package romanovskaya.lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(0);
        list.add(5);
        list.add(0);
        list.add(7);
        list.add(10);
        list.add(1);

        System.out.println("Список всех чисел");

        System.out.println(list);


        System.out.println("Список без повторяющихся чисел");

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);

    }
}
