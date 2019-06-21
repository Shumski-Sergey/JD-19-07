package romanovskaya.lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Task2TreeSet {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(2);
            list.add(6);
            list.add(10);
            list.add(8);
            list.add(3);
            list.add(6);
            list.add(10);
            list.add(10);

            System.out.println("Список всех оценок");

            Collections.sort(list);
            for (Integer k : list) {
                System.out.print(k + " ");
            }

            System.out.println();

            System.out.println("Список неповторяющихся оценок");

            TreeSet<Integer> set = new TreeSet<Integer>();
            set.add(2);
            set.add(6);
            set.add(10);
            set.add(8);
            set.add(3);
            set.add(6);
            set.add(10);
            set.add(10);

            for ( Integer x : set){
                System.out.print(x + " ");
            }

        }
    }


