package sgolovenchik.Lesson8.Collections;

import java.util.ArrayList;

public class A2 {
    public static void main(String[] args) {
        int CountNum = 50;  // число элементов

        ArrayList<Integer> RandNum = new ArrayList<>();
        for (int i = 0; i < CountNum; i++) {
            int m = (int) (Math.random() * 100 + 1);//рандом чисел от 1 до 100
            RandNum.add(i, m);
        }
        System.out.println("Массив до удаления повторов: " + RandNum);

        for (int i = 0; i < CountNum; i++) {
            int Temp = RandNum.get(i);
            for (int j = i+1; j < CountNum; j++) {
                if (Temp == RandNum.get(j)) {
                    RandNum.remove(j);
                    CountNum--;
                    i--;
                }

            }

        }
        System.out.println("Массив после удаления повторов:" +RandNum);
    }
}