package vgorelko.Lesson8.TaskB1;

import java.util.ArrayList;

public class TaskB1 {

    public static void main(String[] args) {
        //Создали обычный массив
        Object arr [] = {"Hello", 2.0, 2f, 'd', 100};

        //Переконвектировали обычный массив в ArrayList
        ArrayList<Object> list = TaskB1.convertation(arr);

        //Вывели ArrayList на печать
        System.out.println(list);

    }

    public static ArrayList<Object> convertation(Object[] arr) {

        ArrayList<Object> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){

            list.add(arr[i]);

        }

        return list;
    }

}
