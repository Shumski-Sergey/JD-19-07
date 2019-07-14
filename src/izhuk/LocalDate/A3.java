package src.izhuk.LocalDate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

public class A3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(reader.readLine());
        int day = Integer.parseInt(reader.readLine());
        try {
            LocalDate from = LocalDate.of(2001, month, day);
            LocalDate to = LocalDate.of(2001, 12, 31);
            System.out.println(DAYS.between(from, to));}
        catch (Exception e){
            System.out.println("-1");
        }
    }
}

