package src.izhuk.Lesson9;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class lesson9A3 {
    public static void main(String[] args) {
        List<Integer> ratingsList = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            ratingsList.add((int)(Math.random()*10));
        }
        System.out.println("Общий список оценок учеников: " + ratingsList);

        Iterator<Integer> iterator = ratingsList.iterator();
        int max = ratingsList.get(0);
        while (iterator.hasNext()){
            int itr = iterator.next();
            if (max < itr){
                max = itr;
            }
        }
        System.out.println("Самая большая оценка: " + max);
    }
}
