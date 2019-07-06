package sgolovenchik.Lesson10.Srteams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TimeTest {
    public static void main(String[] args) {
        ArrayList<String> randomlist;
        randomlist = new ArrayList<>();
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        for (int j = 0; j < 10000; j++) {// наполняем ArrayList (randomlist) количеством строк j

            StringBuilder randString = new StringBuilder();//строка из случайных символов строки symbols
            for (int i = 0; i < 10; i++) {                 //строки по 10 символов
                randString.append(symbols.charAt((int) (Math.random() * symbols.length())));
            }
            System.out.println("RandomString "+j+" : "+randString);
            String temp = randString.toString();
            randomlist.add(j, temp);
        }
        System.out.println("Random String Array :              " +randomlist);

        //Теперь пробежим по массиву (изменяя регистр символа toLowerCase)
        // двумя потоками последовательным и парралельным и измерим время выполнения


        long t1 = System.currentTimeMillis();
        ArrayList<String> test1 = randomlist.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(()->new ArrayList<>()));    //stream
        long t2 = System.currentTimeMillis();
        System.out.println("Random String Array To Lower Case :" +test1);
        System.out.println("Time for Srteams : " +(t2-t1)+" msek.");

        long t3 = System.currentTimeMillis();
        ArrayList<String> test2 = randomlist.parallelStream()
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(()->new ArrayList<>()));   //parallelStream
        long t4 = System.currentTimeMillis();
        System.out.println("Random String Array To Lower Case :" +test2);
        System.out.println("Time for parallelSrteam : " +(t4-t3)+" msek.");


                //randomlist.stream()
                //.filter(s -> s.startsWith("c"))
                //.map(String::toLowerCase)
                //.sorted()
                //.forEach(System.out::println);





    }
}


