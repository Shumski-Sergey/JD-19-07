package rashkevich.lesson13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//узнать день недели

public class Task1 {
    public static void main(String[] args){
        String time="2019-06-28 18:25:08";
        List<Integer> list=Stream.of(time)
                .map(s -> s.split("\\s+|-|:"))
                .flatMap(Arrays::stream).distinct()
                .map(s->Integer.parseInt(s))
                .limit(3)
                .collect(Collectors.toList());
        LocalDate dateTime=LocalDate.of(list.get(0),list.get(1),list.get(2));
        System.out.println(dateTime.getDayOfWeek());

    }
}
