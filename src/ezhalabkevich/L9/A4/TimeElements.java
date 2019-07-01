package ezhalabkevich.L9.A4;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;


public class TimeElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Random rand = new Random();
        Date date = new Date();
        long timeArrayList =date.getTime();
        Add(arrayList, rand);
        Get(arrayList, rand);
        timeArrayList=date.getTime()-timeArrayList;
        System.out.println("Время arrayList "+timeArrayList);
        long timeLinkedList=date.getTime();
        Add(linkedList, rand);
        Get(linkedList, rand);
        timeLinkedList=date.getTime()-timeLinkedList;
        System.out.println("Время linkedList "+timeLinkedList);

    }
    public static void Add(ArrayList list, Random rand){
        for (int i = 0; i <1000000 ; i++) {
            list.add(rand.nextInt(20));
        }
    }
    public static void Add(LinkedList list, Random rand){
        for (int i = 0; i <1000000 ; i++) {
            list.add(rand.nextInt(20));
        }
    }
    public static void Get(ArrayList list, Random rand){
        for (int i = 0; i <10000 ; i++) {
            list.get(rand.nextInt(100000));
        }
    }
    public static void Get(LinkedList list, Random rand){
        for (int i = 0; i <10000 ; i++) {
            list.get(rand.nextInt(100000));
        }
    }
}
