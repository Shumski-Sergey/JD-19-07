package ezhalabkevich.L9.A3;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class MaxMark {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<Integer>();
        ListIterator <Integer> iterator = arrayList.listIterator();
        Random rand = new Random();
        for (int i=0;i<30;i++){
            arrayList.add(rand.nextInt(9)+1); //заполнили случайными числами
        }
        System.out.println("Список оценок");
        for (Object o:arrayList) {
            System.out.print(o+" ");
        }
        System.out.println("");
        int max=arrayList.get(0);
        //while (iterator.hasNext()){
            for (Object o: arrayList) {
                if(max<arrayList.get(iterator.nextIndex())){
                    max=arrayList.get(iterator.nextIndex());
                    System.out.println(" "+max);
                }
            }


       // }
        System.out.println("Max mark is "+max);
    }
}
