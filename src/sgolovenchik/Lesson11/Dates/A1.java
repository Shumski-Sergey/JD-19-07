package sgolovenchik.Lesson11.Dates;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input Date (yyyy-mm-dd) :");    //2020-05-23
        String SomeString = in.nextLine();
        System.out.println("0-sunday , 1-monday etc..");

        String[] Date = SomeString.split("[^0-9]+");
        int year = Integer.parseInt(Date[0]);           //получаем int значения из года, месяца, числа
        int month = Integer.parseInt(Date[1]);
        int day = Integer.parseInt(Date[2]);
        //System.out.println(year+" "+month+" "+day);

        // 1ый способ методом Calendar.DAY_OF_WEEK
        Calendar calendar = new GregorianCalendar();
        calendar.set(year, month-1, day); //первый месяц имеет значение 0
        int i = calendar.get(Calendar.DAY_OF_WEEK); //номер дня недели
        System.out.println("1ый способ: \nДень недели даты "+SomeString+" номер: "+(i-1)); // DAY_OF_WEEK принимает
        int b = calendar.get(Calendar.DAY_OF_YEAR);                                      // значения  1-7 (где 1- воскресение)
        //System.out.println(calendar);
        //System.out.println("День года : "+b);

        // 2oй способ расчётный
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31*m0)/12) % 7;             // 0 - воскресенье
        System.out.println("2ой способ: \nДень недели даты "+SomeString+" номер: "+d0);

        // 3ий способ через LocalDate
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println("3ий способ: \nДень недели даты "+SomeString+" : " +date.getDayOfWeek());
        //System.out.println("День года : " +date.getDayOfYear());

    }
}
