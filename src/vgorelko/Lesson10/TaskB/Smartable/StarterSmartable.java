package vgorelko.Lesson10.TaskB.Smartable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class StarterSmartable {

    public static void main(String[] args) {
//Метод должен удалить все вхождения element между start (включительно) и
//end (исключительно) индексами. Вхождения вне этого индекса, а также другие
//значения должны остаться без изменений.
        SmartableIml smartableIml = new SmartableIml();

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(0);
        list.add(6);
        list.add(0);
        list.add(8);
        list.add(0);
        list.add(10);
        list.add(0);
        list.add(12);
        list.add(0);
        list.add(14);
        list.add(0);
        list.add(16);
        System.out.println("Исходный вариант листа");
        System.out.println(list);
        System.out.println("Скорректированный вариант листа");
        System.out.println(smartableIml.removeInRange(list, 0, 5, 13));
        System.out.println();

//возвращает true, если в отображении нет двух и более одинаковых
//value, и false в противном случае.
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        map1.put("Вася", "Иванов");
        map1.put("Петр", "Петров");
        map1.put("Виктор", "Сидоров");
        map1.put("Сергей", "Савельев");
        map1.put("Вадим", "Викторов");

        map2.put("Вася", "Иванов");
        map2.put("Петр", "Петров");
        map2.put("Виктор", "Иванов");
        map2.put("Сергей", "Савельев");
        map2.put("Вадим", "Викторов");

        System.out.println("Все фамилии в map1 уникальны: " + smartableIml.isUnique(map1));
        System.out.println("Все фамилии в map2 уникальны: " + smartableIml.isUnique(map2));

//Возвращает отображение, который содержит пары
//«ключ=значение», присутствующие в обоих отображениях.
        Map<String, Integer> mapIntersect1 = new HashMap<>();
        Map<String, Integer> mapIntersect2 = new HashMap<>();

        mapIntersect1.put("Janet", 87);
        mapIntersect1.put("Logan", 62);
        mapIntersect1.put("Whitaker", 46);
        mapIntersect1.put("Alyssa", 100);
        mapIntersect1.put("Stefanie", 80);
        mapIntersect1.put("Jeff", 88);
        mapIntersect1.put("Kim", 52);
        mapIntersect1.put("Sylvia", 95);

        mapIntersect2.put("Logan", 62);
        mapIntersect2.put("Kim", 52);
        mapIntersect2.put("Whitaker", 52);
        mapIntersect2.put("Jeff", 88);
        mapIntersect2.put("Stefanie", 80);
        mapIntersect2.put("Brian", 60);
        mapIntersect2.put("Lisa", 83);
        mapIntersect2.put("Sylvia", 87);

        System.out.println();
        System.out.println("Выводим повторы (где совпадает и ключ и значения)");
        System.out.println(smartableIml.intersect(mapIntersect1, mapIntersect2));

//Возвращает количество уникальных совпавших значений в обоих
//списках.
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        list1.add(3);
        list1.add(7);
        list1.add(3);
        list1.add(-1);
        list1.add(2);
        list1.add(3);
        list1.add(7);
        list1.add(2);
        list1.add(15);
        list1.add(15);

        list2.add(-5);
        list2.add(15);
        list2.add(2);
        list2.add(-1);
        list2.add(7);
        list2.add(15);
        list2.add(36);

        System.out.println();
        System.out.println("Количество повторов");
        System.out.println(smartableIml.countCommon(list1, list2));

//возвращает множество, в котором удалены все элементы четной
//длины из исходного множества
        Set<String> setRemove = new HashSet<>();
        setRemove.add("foo");
        setRemove.add("buzz");
        setRemove.add("bar");
        setRemove.add("fork");
        setRemove.add("bort");
        setRemove.add("spoon");
        setRemove.add("!");
        setRemove.add("dude");

        System.out.println();
        System.out.println("Слова с нечетной длиной");
        System.out.println(smartableIml.removeEvenLength(setRemove));

//возвращает количество вхождений наиболее часто встречающегося
//элемента
        List<Integer> listMaxOccurrences = new ArrayList<>();
        listMaxOccurrences.add(4);
        listMaxOccurrences.add(7);
        listMaxOccurrences.add(4);
        listMaxOccurrences.add(-1);
        listMaxOccurrences.add(2);
        listMaxOccurrences.add(4);
        listMaxOccurrences.add(7);
        listMaxOccurrences.add(2);
        listMaxOccurrences.add(15);
        listMaxOccurrences.add(15);

        System.out.println();
        System.out.println("Количество наиболее часто встречающегося элемента");
        System.out.println(smartableIml.maxOccurrences(listMaxOccurrences));


    }

}
