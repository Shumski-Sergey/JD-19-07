package vgorelko.Lesson9.TaskB1;

import java.util.*;

public class Parsing {

    public TreeMap parsing(String text) {

        String arr [] = text.split("\\s*[ /&\",.!?1234567890()]\\s*"); //Тут храним все слова

        TreeMap<String, Integer> treeMap = new TreeMap<>(); //Используем TreeMap, так как мне нужна сортировка в последующем и mapa с ключем

       for (int i = 0; i < arr.length; i++) { //Копируем уникальные слова в мапу
           treeMap.put(arr[i], 0);
       }

        treeMap.remove(""); //Удаляю пустоту, по какой-то причине попадала в массив (видно ошибка в регулярке (в split)).

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) { //Считаем количество повторов

            for (int i = 0; i < arr.length; i++) {

                if (entry.getKey().equals(arr[i])) {
                    treeMap.put(entry.getKey(), entry.getValue()+1);
                }

            }
        }

       // System.out.println(treeMap);

        return treeMap;
    }

}