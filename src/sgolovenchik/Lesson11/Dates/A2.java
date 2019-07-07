package sgolovenchik.Lesson11.Dates;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) throws DateTimeException {

try {
    Scanner in = new Scanner(System.in);
    System.out.print("Input Date (yyyy-mm-dd) :");
    String SomeString = in.nextLine();

    String[] Date = SomeString.split("[^0-9]+");
    int year = Integer.parseInt(Date[0]);           //получаем int значения из года, месяца, числа
    int month = Integer.parseInt(Date[1]);
    int day = Integer.parseInt(Date[2]);
    System.out.println(isDateOdd(year, month, day));

} catch  (DateTimeException e){                      //исключение на ввод неверной даты
    System.out.println("Дата введена неверно");
}
    }

    private static boolean isDateOdd(int y, int m, int d) {  //метод чёт/нечет дня года по дате

        LocalDate date = LocalDate.of(y, m, d);
        int DayCounter = date.getDayOfYear();
        System.out.println("Day of year: " +DayCounter);
        return ((DayCounter % 2) == 1); //нечётный - true чётный - false
    }
}

