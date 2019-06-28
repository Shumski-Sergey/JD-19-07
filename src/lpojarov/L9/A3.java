package lpojarov.L9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class A3 {
    public static void main(String[] args) {

        ArrayList<String> children=new ArrayList<>();
        ArrayList<Integer> ratings = new ArrayList<>();
        children.add("Саша");
        children.add("Маша");
        children.add("Даша");
        children.add("Паша");
        children.add("Каша");
       /// System.out.println(children);
        for (int i = 0; i < 5; i++) {
            int a = (int) (Math.random() * 10 + 1);
            ratings.add(a);






        }
System.out.println("Оценки всего класса;");
        System.out.println(ratings.get(0)+"-"+children.get(0));
        System.out.println(ratings.get(1)+"-"+children.get(1));
        System.out.println(ratings.get(2)+"-"+children.get(2));
        System.out.println(ratings.get(3)+"-"+children.get(3));
        System.out.println(ratings.get(4)+"-"+children.get(4));
   //    System.out.println("Сама высокая оценка в классе = "+Collections.max(ratings));

        Iterator Max=  ratings.iterator();
        int max=0;
        while (Max.hasNext()){
            int i = (int)Max.next();
            if (max<i){
                max=i;
            }
        }
        System.out.println("Лучшая оценка класса "+max);
    }
}
