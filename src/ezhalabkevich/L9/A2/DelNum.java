package ezhalabkevich.L9.A2;

import java.util.*;

public class DelNum {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Random rand = new Random();
        for (int i=0;i<30;i++){
            arrayList.add(rand.nextInt(9)+1); //заполнили случайными числами
        }
        System.out.println("Начальный список");
        for (Object o:arrayList) {
            System.out.print(o+" ");
        }

        TreeSet set = new TreeSet();
        for (Object o:arrayList) {
            set.add(o);
                }
        System.out.println();
        System.out.println("Конечный список");
        for (Object o: set) {
            System.out.print(o+" ");
        }


    }
}
