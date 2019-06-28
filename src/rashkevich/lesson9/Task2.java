package rashkevich.lesson9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();
        for (int i=0;i<10;i++){
            int num=(int)(Math.random()*10);
            list.add(num);
        }

        for (int n:list){
            System.out.println(n);
        }
        System.out.println("-----------------------");

        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for( int i:list){
            set.add(i);
        }


        for (int n:set){
            System.out.println(n);
        }
    }
}
