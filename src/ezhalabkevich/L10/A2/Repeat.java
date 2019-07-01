package ezhalabkevich.L10.A2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Repeat {
    public static void main(String[] args) {
       // String str = "1, 2, 3, 4,4,4,4, 5";
        ArrayList<Object> arrayList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            arrayList.add(rand.nextInt(20));

        }
        for (Object o : arrayList
        ) {
            System.out.print(o+" ");

        }
        System.out.println("");

        HashMap<Object, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < 20; i++) {
            Object symbol = arrayList.get(i);
            if (hashMap.containsKey(symbol)) {
                count++;
                hashMap.put(symbol, count);
            } else {
                count = 1;
                hashMap.put(symbol, count);
            }

        }
        for (HashMap.Entry<Object, Integer> entry:hashMap.entrySet()
             ) {
            System.out.print (entry.getKey()+"="+entry.getValue()+" ");

        }
    }
}
