package src.izhuk.Lesson9;

import java.util.List;
import java.util.ArrayList;


public class lesson9A2 {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            numbersList.add((int)(Math.random()*100));
        }
        System.out.println(numbersList);

        List<Integer> numbersList2 = new ArrayList<>();

        for (Integer i : numbersList){
            if (!numbersList2.contains(i)){
                numbersList2.add(i);
            }
        }
        System.out.println(numbersList2);
    }
}
