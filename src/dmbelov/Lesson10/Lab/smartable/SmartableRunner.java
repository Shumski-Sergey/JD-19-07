package dmbelov.Lesson10.Lab.smartable;

import java.util.*;

public class SmartableRunner {
    public static void main(String[] args) {

        //Проверка метода removeIntRange
        int [] array = {0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16};
        List<Integer> list = new ArrayList<>();
        for (int a:array) {
            list.add(a);
        }

        ImplSmartable s = new ImplSmartable();
        list = s.removeInRange(list,0,5,13);
        System.out.print(list + "\n");

        //Проверка метода isUnique
        String [] firstName = {"Вася", "Петр", "Виктор", "Сергей", "Вадим"};
        //String [] lastName  = {"Иванов", "Петров", "Сидоров", "Савельев", "Викторов"};
        String [] lastName  = {"Иванов", "Петров", "Иванов", "Савельев", "Петров"};

        Map<String, String> map = new HashMap<>();
        for(int i=0; i<5; i++){
            map.put(firstName[i], lastName[i]);
        }

        boolean uniqueLastName = s.isUnique(map);
        System.out.print(uniqueLastName + "\n");

        //Проверка метода intersect
        String [] names1 = {"Janet", "Logan", "Whitaker", "Alyssa", "Stefanie", "Jeff", "Kim", "Sylvia"};
        int [] grades1 = {87, 62, 46, 100, 80, 88, 52, 95};
        String [] names2 = {"Logan", "Kim", "Whitaker", "Jeff", "Stefanie", "Brian", "Lisa", "Sylvia"};
        int [] grades2 = {62, 52, 52, 88, 80, 60, 83, 87};

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for(int i=0; i<names1.length; i++){
            map1.put(names1[i],grades1[i]);
            map2.put(names2[i],grades2[i]);
        }

        Map<String, Integer> mapOutput;
        mapOutput = s.intersect(map1, map2);
        System.out.print(mapOutput + "\n");


        //Проверка метода countCommon
        List<Integer> list1 = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        List<Integer> list2 = Arrays.asList(-5, 15, 2, -1, 7, 15, 36);
        int countCommon = s.countCommon(list1, list2);
        System.out.print(countCommon + "\n");


        //Проверка метода removeEvenLength
        List<String> list3 = Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude");
        Set<String> set = new HashSet<>(list3);
        set = s.removeEvenLength(set);
        System.out.print(set + "\n");

        //Проверка метода maxOccurrences
        List<Integer> list4 = Arrays.asList(4, 7, 4, -1, 2, 4, 7, 2, 15, 15);
        int occur = s.maxOccurrences(list4);
        System.out.print(occur);
    }
}
