package vgorelko.Lesson12;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Test
    {

        public static void main(String[] args) {

            List<Integer> numbers =  new Random().ints(0,1000000).limit(1000000).boxed().collect(Collectors.toList());

            long startTime1 = System.currentTimeMillis();

            Stream<Integer> stream1 = numbers.stream();
            int a = stream1.reduce(0, (acc, element) -> acc + element);
            System.out.println("Суммарное значение, которое рандомно сгенерировалось: " + a);

            long timeSpent1 = System.currentTimeMillis() - startTime1;
            System.out.println("программа Stream выполнялась " + timeSpent1 + " миллисекунд");

            //теперь сделаем поток для parallel

            long startTime2 = System.currentTimeMillis();

            Stream<Integer> stream2 = numbers.stream();
            int b = stream2.parallel().reduce(0, (acc, element) -> acc + element);
            System.out.println("Суммарное значение, которое рандомно сгенерировалось: " + b);

            long timeSpent2 = System.currentTimeMillis() - startTime2;
            System.out.println("программа StreamParallel выполнялась " + timeSpent2 + " миллисекунд");

        }
    }



