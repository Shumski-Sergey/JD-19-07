package sgolovenchik.Lesson9.Maps;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input comma-separated numbers : ");
        String SomeString = in.nextLine();
        System.out.println(SomeString);

        Map< String, String> SomeMap = new HashMap<>();
        String[] SplitSomeString = SomeString.split("[^0-9]+");
        for (int i = 0; i < SplitSomeString.length; i++) {
            //System.out.println(SplitSomeString[i]);
            SomeMap.put(SplitSomeString[i], "пофиг что"); //наполняем Map используя его свойство
                                                          //не добавлять повторяющиеся ключи
        }
        System.out.print("Вывод без повторений: ");
        for (String key : SomeMap.keySet()) {
            System.out.print( key+ ",");
        }
    }
}

