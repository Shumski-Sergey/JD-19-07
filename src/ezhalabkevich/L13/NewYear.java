package ezhalabkevich.L13;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Stream;

public class NewYear {
    public static void main(String[] args) throws IOException {
      /*Напишите программу, которая вводит с клавиатуры номер месяца и день, и определяет, сколько дней осталось до Нового года.
      При вводе неверных данных должно быть выведено сообщение об ошибке. Считается, что год невисокосный.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();
/*
        System.out.println("Введите номер месяца и номер дня через пробел! ");
        String monthDay = reader.readLine();
        for (String words : monthDay.split(" ")) {
            arrayList.add(Integer.parseInt(words));

        }
        LocalDate date =  LocalDate.of(0, arrayList.get(0),arrayList.get(1)) ;
        System.out.println("До Нового года осталось ... "+(365-date.getDayOfYear())+" дней!");
*/
        Stream.of("10", "11", "32")
                        .map(x -> Integer.parseInt(x, 16))
                        .forEach(System.out::println);


    }
}
