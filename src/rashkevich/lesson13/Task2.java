package rashkevich.lesson13;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[]   args){
        String time="2019-06-28 18:25:08";
        System.out.println("Year odd:"+isDateOdd(time));
    }
    public static boolean isDateOdd(String time){
        boolean flag=false;
        List<Integer> list= Stream.of(time)
                .map(s -> s.split("\\s+|-|:"))
                .flatMap(Arrays::stream).distinct()
                .map(s->Integer.parseInt(s))
                .limit(3)
                .collect(Collectors.toList());
        LocalDate dateTime=LocalDate.of(list.get(0),list.get(1),list.get(2));
        int days = dateTime.getDayOfYear();
            if (days%2==0){
                flag=true;
            }
        return flag;
    }
}
