package rashkevich.lesson13;
//Напишите программу, которая вводит с клавиатуры номер месяца и день,
//        и определяет, сколько дней осталось до Нового года.
//        При вводе неверных данных должно быть выведено сообщение об ошибке.
//        Считается, что год невисокосный.
//        Входные данные
//        Входная строка содержит два целых числа: номер месяца и номер дня в этом месяце.
//        Выходные данные
//        Программа должна вывести количество дней, оставшихся до Нового года.
//        Если введены неверные данные, нужно вывести число -1.


import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args){
    getData();
    }

    public static int getData(){
    System.out.println("Введите номер месяца и день через пробел, чтобы узнать сколько осталось дней до Нового Года:");
    String string=new String();
    Integer i=-1;

        Scanner sc = new Scanner(System.in);
        string=sc.nextLine();

        List<String> list = Stream.of(string)
                .map(s -> s.split("\\s"))
                .flatMap(Arrays::stream)//.distinct()
                .map(s->s.trim())
                .collect(Collectors.toList());
        System.out.println("Введены данные:"+list);

        if (list.size()>=2){
            i=daysToNY(list.get(0),list.get(1));
            if (i!=-1){
            System.out.println(i+" дней(день) осталось(ся) до Нового Года.");
            } else{
                System.out.println("Неправильно введены данные:"+i);
            }
        }else {
            System.out.println("Неправильно введены данные:"+i);
        }
        return i;
    }

    private static int daysToNY(String month, String day) {
        int d = -1;
        try {
            Integer monthInt = Integer.parseInt(month);
            Integer dayInt = Integer.parseInt(day);

                LocalDate dateTime = LocalDate.of(2019, monthInt, dayInt);
                 d = 365 - dateTime.getDayOfYear();
        }catch (NumberFormatException e){
            System.out.println("Введен неверный числовой формат "+e);
        }catch (DateTimeException e){
            System.out.println("Введен неверный формат даты "+e);
            }
        return d;
    }
}
