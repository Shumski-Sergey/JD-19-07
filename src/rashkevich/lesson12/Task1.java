package rashkevich.lesson12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        Date dateStart=new Date();
        IntStream.range(0,1000000).forEach((i)->list.add(i,i));
        list.stream().map(i->i*3).forEach(System.out::println);
        Date dateStop=new Date();
        list.parallelStream().map(i->i*3).forEach(System.out::println);
        Date dateSecStop=new Date();
        System.out.println((dateStop.getTime()-dateStart.getTime())+" "+(dateSecStop.getTime()-dateStop.getTime()));
    }
}
