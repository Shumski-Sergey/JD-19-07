package vgorelko.Lesson8.TaskA2;

import java.io.IOException;
import java.util.ArrayList;

public class Starter {

    public static void main(String[] args) throws IOException {

        //Читаем информацию из файла
        ReadCatalog readCatalog = new ReadCatalog();
        String text =  readCatalog.ReadFile("newfile.txt");

        //Переносим информацию в ArrayList
        InsertInTheList insertInTheList = new InsertInTheList();
        ArrayList<String> list = insertInTheList.insetList(text);

        //Выводим на печать первые 5 элементов из list
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }


}
