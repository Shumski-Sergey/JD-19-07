package vgorelko.Lesson14.TaskA1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

//Найти байт или байты с максимальным количеством повторов.
// Вывести их на экран через пробел. Закрыть поток ввода-вывода

public class TaskA1 {

    //Инициализируем штучки
    public static void main(String[] args) throws Exception {
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        //Вводим имя файла
        FileInputStream fileInputStream = new FileInputStream(r.readLine());

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

//Пробегаемся побайтово по файлу и копируем в лист
        for (int i = fileInputStream.available(); i > 0; i--) {
            int data = fileInputStream.read();
            list1.add(data);
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.size(); i++) {
            map.put(list1.get(i), 0);
        }

        //Вставляем в мапу количесвто повторов
        for (Map.Entry entry : map.entrySet()){
            int count = 0;
        for (int i = 0; i < list1.size(); i++ ){

                if (entry.getKey().equals(list1.get(i))) {
                    count ++;
                }
            }
            map.put((Integer) entry.getKey(), count);
        }

        //Находим максимальное количество повторов
        int max = 0;
        for (Map.Entry entry : map.entrySet()){
            if ((Integer)entry.getValue() >= max){
                max = (Integer)entry.getValue();
            }
        }

        //Выводим все числа с максимальным количеством повторов
        for (Map.Entry entry : map.entrySet()){
            if ((Integer)entry.getValue() == max){
                System.out.print(entry.getKey() + " ");
            }
        }


        System.out.println();
        System.out.println("Максимальное количество повторов " + max);
        System.out.println("Весь массив даннных: " + map);


    }

}
