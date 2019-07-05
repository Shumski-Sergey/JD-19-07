package ezhalabkevich.L12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

public class Time {
    public static void main(String[] args) {
        List <Integer> ints = new ArrayList<>(10000);
        Date date = new Date();
        long timeStream = System.currentTimeMillis();
        IntStream.range(0, 1000000).forEach(ints::add);
        ints.stream().mapToInt(s->s+1).forEach(System.out::println);
       System.out.println("кол-во элементов " +ints.size());
        timeStream=System.currentTimeMillis()-timeStream;
       System.out.println("Время выполнения для Stream"+timeStream);
      //  IntStream.range(0,1000000).parallel().forEach(ints::add);
    }
}
