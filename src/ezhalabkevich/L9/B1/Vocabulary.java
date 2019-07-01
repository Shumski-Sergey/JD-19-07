package ezhalabkevich.L9.B1;

import java.util.HashMap;
import java.util.Iterator;

public class Vocabulary {
    public static void main(String[] args) {
        String text = "aaaaa";
        HashMap<Object, Integer>  analiz = new HashMap<>();



int count=0;
        for (int i = 0; i <text.length()+1 ; i++) {
            Object symbol=analiz.get(text.charAt(i));
            analiz.put( text.charAt(i),symbol == null ? count=1 : count++);
        }
        System.out.println(analiz+" "+ text.length());


    }
}
