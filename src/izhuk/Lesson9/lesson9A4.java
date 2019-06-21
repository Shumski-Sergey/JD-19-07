package src.izhuk.Lesson9;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Date;


public class lesson9A4 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        getTimeMsOfAdd(arrayList);
        getTimeMsOfAdd(linkedList);

        getTimeMsOfInsert(arrayList);
        getTimeMsOfInsert(linkedList);


    }

    public static void addPull (List list){
        for (int i = 0; i < 1000000; i++){
            list.add(i);
        }
    }

    public static void getNumbers(List list){
        for (int i = 0; i < 10000; i++){
            list.get((int) Math.random()*1000000);
        }
    }

    public static  void getTimeMsOfAdd(List list) {
        Date currentTime = new Date();
        addPull(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Результат вставок в миллисекундах: " + msDelay);
    }

    public static void getTimeMsOfInsert(List list) {
        Date currentTime = new Date();
        getNumbers(list);
        Date newTime1 = new Date();
        long msDelay1 = newTime1.getTime() - currentTime.getTime();
        System.out.println("Результат выбора из списка в миллисекундах: " + msDelay1);

    }
}

