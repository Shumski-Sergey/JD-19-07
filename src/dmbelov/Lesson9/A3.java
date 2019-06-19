package dmbelov.Lesson9;

import java.util.ArrayList;
import java.util.Iterator;

public class A3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int randomI = (int) (Math.random()*31+21);
        for(int i=0; i<=randomI; i++){
            int randomMark = (int) (Math.random()*100+1);
            list.add(randomMark);
        }
        System.out.println("First array: " + list + " " + list.size());

        findMaxMark(list);
    }
    private static void findMaxMark(ArrayList<Integer> mylist){
        int max = mylist.get(0);
        Iterator<Integer> iterator = mylist.iterator();
        while (iterator.hasNext()){
            int x = iterator.next();
            if(x>max){
                max=x;
            }
        }
        System.out.print("Max mark is: " + max);
    }
}

