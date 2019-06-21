package src.inikalayeva.Lesson9;

import java.util.ArrayList;
import java.util.LinkedList;

public class A4 {
    public static void main(String[] args){
        int adding = 1000000;
        int getting = 1000;

        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();

        long startArrayList = System.currentTimeMillis();
        for (int i = 0; i < adding; i++){
            arrayList.add(Math.random());
        }
        System.out.println("Adding for ArrayList " + (System.currentTimeMillis() - startArrayList));

        long startLinkedList = System.currentTimeMillis();
        for (int i = 0; i < adding; i++){
            linkedList.add(Math.random());
        }
        System.out.println("Adding for LinkedList " + (System.currentTimeMillis() - startLinkedList));

        long startGettingArrayList = System.currentTimeMillis();
        for (int i = 0; i < getting; i++) {
            arrayList.get(i);
        }
        System.out.println("Getting for ArrayList " + (System.currentTimeMillis() - startGettingArrayList));

        long startGettingLinkedList = System.currentTimeMillis();
        for (int i = 0; i < getting; i++) {
            linkedList.get(i);
        }
        System.out.println("Getting for LinkedList " + (System.currentTimeMillis() - startGettingLinkedList));
    }
}
