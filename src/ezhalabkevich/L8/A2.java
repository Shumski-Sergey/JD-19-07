package ezhalabkevich.L8;

import java.util.ArrayList;
import java.util.List;

public class A2 <T>{
    public static void main(String[] args) {
        /*Написать ф-ю, которая сохранит содержимое каталога в список и выведет первые 5 элементов на экран.*/
        int n=1;
        Object [] array = new Object [] {1,"dog",3.5,5,-19, "cat", 3.569};
      ArrayList arrayList = new ArrayList();
      FirstFive(array, arrayList);

    }
public static void FirstFive(Object[] mas, ArrayList arrayList){

 /*   for (int i = 0; i < mas.length ; i++) {
        arrayList.add(mas[i]);

    }*/
        for (Object o:mas){
        arrayList.add(o); //закинули все элементы в список
    }
    for (int i = 0; i <5 ; i++) {
        System.out.println((i+1)+": "+arrayList.get(i));
    }
}
}
