package src.izhuk.LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class A2 {
    public static void main(String[] args) {

        LocalDate localdate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        String formattedString = localdate.format(formatter);
        System.out.println(isDateOdd(formattedString));
    }

    public static boolean isDateOdd(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate taskDate = LocalDate.parse(date, formatter);
        if (taskDate.getDayOfYear() % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}

