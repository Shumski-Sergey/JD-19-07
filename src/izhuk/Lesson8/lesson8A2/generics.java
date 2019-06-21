package src.izhuk.Lesson8.lesson8A2;

import java.util.ArrayList;

public class generics {
    public static void main(String[] args) {
        int [] array = new int[]{17, 2, 33, 89, 1, 98, 3};
        ArrayList list = new ArrayList();

        listPull(array, list);
    }

    public static void listPull(int[] mass, ArrayList array){
        for (int i = 0; i < mass.length; i++){
            array.add(mass[i]);
        }

        if (array.size() >= 5) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array.get(j) + " ");
            }
        }
        else {
            System.out.println("В массиве меньше 5 элементов");
        }
    }
}
