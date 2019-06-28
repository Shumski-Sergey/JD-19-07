package vgorelko.Lesson13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskA2 {

    public static void main(String[] args) {

        //Устанавливаем формат даты
        DateFormat dateFormat = new SimpleDateFormat("dd"); //"yyyy/MM/dd HH:mm:ss"
        // Инициализация объекта date
        Date date = new Date();
        // Вывод текущей даты и времени с использованием toString()
        int curentDay = Integer.parseInt(dateFormat.format(date));

        if (curentDay%2 == 0) {

            System.out.println("Сегодня твой день! Ты можешь отдохнуть на Небуле-1!!!");

        } else  {
            System.out.println("Увы, отдохнёшь завтра!!!");
        }



    }

}
