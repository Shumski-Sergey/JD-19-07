package src.inikalayeva.Lesson9;

import java.util.ArrayList;

public class A2 {
    public static void main(String[] args){
        ArrayList <Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < 20; i ++){
            listOfNumbers.add((int)(Math.random() * 10));
            System.out.print(listOfNumbers.get(i) + " ");
        }
        System.out.println("");

        for (int i = 0; i < listOfNumbers.size(); i++){
            int actualElement = listOfNumbers.get(i);
            for (int j = i + 1; j < listOfNumbers.size(); j++){
                int forCompare = listOfNumbers.get(j);
                if (actualElement == forCompare) {
                    listOfNumbers.remove(j);
                }
            }
        }

        for (int i = 0; i < listOfNumbers.size(); i ++){
            System.out.print(listOfNumbers.get(i) + " ");
        }
    }
}
