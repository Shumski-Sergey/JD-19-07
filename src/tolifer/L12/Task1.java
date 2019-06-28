package tolifer.L12;


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

// сравнить streem с параллельным, записать в список 100000 элементов радномно, пробежать по стриму (toLowerCase - если стринг,
// если список числовой, то к каждому элементу прибавить 1)


public class Task1 {
    public static void main (String [] args){

        List<Integer> list = new Random().ints().limit(100000).boxed().collect(Collectors.toList());


        long start = System.nanoTime();
        list.stream().map(x -> x+1);
        System.out.println(System.nanoTime()-start);

        start = System.nanoTime();
        list.parallelStream().map(x -> x+1);
        System.out.println(System.nanoTime()-start);


    }
}
