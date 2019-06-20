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

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        int maximal = list.get(0);
        int minimal = list.get(0);

        for (int i = 0; i < list.size(); i++) {

            if (minimal > list.get(i))
                minimal = list.get(i);

            if (maximal < list.get(i))
                maximal = list.get(i);

        }
            System.out.println("Минимальное число" + " " +  minimal);
            System.out.println("Максимальное число" + " " + maximal);
        }
    }

