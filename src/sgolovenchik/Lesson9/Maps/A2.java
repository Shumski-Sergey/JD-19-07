package sgolovenchik.Lesson9.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class A2 {
    public static void main(String[] args) {


        ArrayList<Integer> RandNum = new ArrayList<>(); //создадим массив 100 случайных чисел
        for (int i = 0; i < 100; i++) {
            int m = (int) (Math.random() * 100 + 1);//рандом чисел от 1 до 100
            RandNum.add(i, m);
        }
        System.out.println(RandNum);
        System.out.println(RandNum.size());


        //Подсчёт повторов:
        // 1ый способ - наполнить ключи мапы из массива (мапа удалит повторы)
        // и посчитать разницу размеров исходного и полученного массивов

        Map<Integer, Integer> CountMap = new HashMap<>();

        for (int i = 0; i < RandNum.size(); i++) {
            CountMap.put(RandNum.get(i), 5);  //"значение" любой int
        }
        System.out.println("1ый способ. В массиве " + (RandNum.size() - CountMap.size()) + " повторов");

        // 2ой способ - при наполнении использовать счётчик при совпадении ключей

        Map<Integer, Integer> CountMap2 = new HashMap<>();
        int NumRepeat = 0;
        for (int i = 0; i < RandNum.size(); i++) {
            Integer Repeat = CountMap2.put(RandNum.get(i),5);
             if ( Repeat != null) {
                 NumRepeat++;
             }
        }
        System.out.println("2ой способ. В массиве "+NumRepeat+" повторов");
    }
}
