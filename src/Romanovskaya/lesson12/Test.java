package romanovskaya.lesson12;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;


public class Test {
    public static void main(String[] args) {
        IntStream range = IntStream.range(0,1000);
        ArrayList<Integer> ints =  new ArrayList<>();

        range.forEach( ints:: add);
        System.out.println(ints.size());
    }
}

