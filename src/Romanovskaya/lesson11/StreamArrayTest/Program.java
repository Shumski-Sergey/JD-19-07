package romanovskaya.lesson11.StreamArrayTest;

import java.util.List;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Сергей", 38));
        persons.add(new Person("Даша", 7));
        persons.add(new Person("Глаша", 3));
        persons.add(new Person("Саша", 6));
        persons.add(new Person("Анна", 18));


        // Поиск среднего возраста старым методом

        int sum = 0;
        int adultPersons = 0;
        for (Person p : persons){
            if ( p.getAge() >= 18){
                sum += p.getAge();
            adultPersons++;
            }
        }
        double averageAge = (double) sum/ adultPersons;
        System.out.println("Средний возраст" + averageAge);

        //новый способ
        double averageAge2 = persons.stream().
               filter(p -> p.getAge() >= 18).
        mapToInt(p -> p.getAge()).average().getAsDouble();
        System.out.println(averageAge2);

    //   for (Person p: persons){
       //     System.out.println(p);
        //}

       persons.stream()
               //фильтруем по возрасту , от 18
               .filter(p -> p.getAge() >= 18).
               // сортируем по возрастанию( по алфавиту)
               sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).
               //выводим имена ( если не преобразовывать  метод toString)
       //        map( p -> p.getName()).
                //выводим все значения на экран
               forEach( System.out::println);

    }
}
