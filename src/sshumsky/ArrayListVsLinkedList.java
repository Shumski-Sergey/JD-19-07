package sshumsky;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    private static final int QUANTITY = 1000000;
    private static final int CHOICE = 1000;

    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        addCalc(arrayList);
        addCalc(linkedList);
        calc(arrayList);
        calc(linkedList);
    }

    private static void addCalc(List<Double> arrayList) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < QUANTITY; i++) {
            arrayList.add(Math.random());
        }
        System.out.println("Add = " + (System.currentTimeMillis() - startTime));
    }

    private static void calc(List<Double> arrayList) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < QUANTITY; i++) {
            arrayList.get((int) (Math.random() * (CHOICE - 1)));
        }
        System.out.println("Get = " + (System.currentTimeMillis() - startTime));
    }
}
