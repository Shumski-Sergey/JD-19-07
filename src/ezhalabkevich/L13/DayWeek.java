package ezhalabkevich.L13;
import java.time.*;

import static java.lang.Integer.parseInt;
import static java.time.LocalDate.of;

public class DayWeek {
    public static void main(String[] args) {
      //  String str ="19890101";
       // int date =parseInt(str);
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfWeek());         //System.out.println(date);
    }
}
