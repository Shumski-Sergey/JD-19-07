package romanovskaya.lesson9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(8);
        list.add(3);
        list.add(6);

        System.out.println("Список всех оценок");

        System.out.println(list);

        int maximal = list.get(0);
        int minimal = list.get(0);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {

            for (Integer test : list) {
                if (test < minimal)
                    minimal = test;
                if (test > maximal)
                    maximal = test;

            }

            System.out.println("Минимальное число" + " " + minimal);
            System.out.println("Максимальное число" + " " + maximal);

            break;
        }
    }

}
