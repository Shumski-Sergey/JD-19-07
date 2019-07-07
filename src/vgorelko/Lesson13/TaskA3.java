package vgorelko.Lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class TaskA3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numMonthText = bufferedReader.readLine();
        String numDayText = bufferedReader.readLine();

        int numMonth = Integer.parseInt(numMonthText);
        int numDay = Integer.parseInt(numDayText);


        LocalDate today = LocalDate.of(2019, numMonth, numDay);
        LocalDate yesterday = LocalDate.of(2019, 12, 31);


// Duration oneDay = Duration.between(today, yesterday);
        int numberDaysForNewYear = (int) Duration.between(today.atStartOfDay(), yesterday.atStartOfDay()).toDays(); //Сравниваем количество дней


        System.out.println("Количество дней до нового года: " + numberDaysForNewYear);
    }


}
