package dmbelov.Lesson9;

import java.util.ArrayList;
import java.util.LinkedList;

public class A4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<1000000; i++){
            int random = (int) (Math.random()*100)+1;
            arrayList.add(random);
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i=0; i<1000000; i++){
            int random = (int) (Math.random()*100)+1;
            linkedList.add(random);
        }

        chooseElement10000times(arrayList, linkedList);
    }

    private static void chooseElement10000times(ArrayList<Integer> myArrayList, LinkedList<Integer> myLinkedList){
        long startTime = System.currentTimeMillis();
        for(int i=1; i<=10000; i++){
            int randomElement = (int) (Math.random()*1000000);
            myArrayList.get(randomElement);
        }
        long stopTime = System.currentTimeMillis();
        long time = stopTime - startTime;
        System.out.println("Time to choose from ArrayList is " + time +" milliSeconds");

        startTime = System.currentTimeMillis();
        for(int i=1; i<=10000; i++){
            int randomElement = (int) (Math.random()*1000000);
            myLinkedList.get(randomElement);
        }
        stopTime = System.currentTimeMillis();
        time = stopTime - startTime;
        System.out.println("Time to choose from LinkedList is " + time +" milliSeconds");
    }
}