package src.izhuk.Lesson9;

import java.util.List;
import java.util.ArrayList;


public class lesson9A1 {
    public static void main(String[] args) {
        List<Integer> ratingsList = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            ratingsList.add((int)(Math.random()*10));
        }
        System.out.println("Общий список оценок учеников: " + ratingsList);

        for (int i = 0; i < ratingsList.size(); i++){
            if (ratingsList.get(i) <= 4){
                ratingsList.remove(i);
                i--;
            }

        }
        System.out.println("Список оценок тех, кто добьется чего-то в жизни: " + ratingsList);
    }
}
