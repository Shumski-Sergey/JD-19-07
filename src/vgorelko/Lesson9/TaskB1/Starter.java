package vgorelko.Lesson9.TaskB1;

import vgorelko.Lesson8.TaskA2.ReadCatalog;

import java.util.*;

public class Starter {

    public static void main(String[] args) {

        //Читаем информацию из файла
        vgorelko.Lesson8.TaskA2.ReadCatalog readCatalog = new ReadCatalog();
        String text =  readCatalog.ReadFile("newfile.txt");

        //Делаем из нашего текста словарь
        Map<String, Integer> map = new Parsing().parsing(text);
        System.out.println(map);


    }

}
