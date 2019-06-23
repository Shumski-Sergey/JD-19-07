package vgorelko.Lesson10.TaskA3;
import java.util.*;

public class TaskA3 {
//Пользователь вводит через один пробел слова. Найти все группы анаграмм (слов, составленных из одних и тех же букв)
//в этой строке и вывести в консоль их каждую с новой строки, все слова должны идти через пробел в порядке, в котором
// они встречаются в строке. При этом допускается выводить одинаковые слова в одной строке анаграмм.
// Слова состоящие из разного количества одинаковых букв анаграммами не являются. Пример:
//
//Входная строка: «123 456 231 546 231 312 4556»
//
//Результат:
//123 231 231 312
//456 546
//4556
//Слова с разным регистром букв  не будут являться анаграммами. Решается данная проблема с помощью комманды которая переводит всю строку к строчному виду.
//    text = text.toLowerCase;

    public static void main(String[] args) {

        Map<String, ArrayList<String>> map = new HashMap<>(); //Значения у нас будут в формате ArrayList, чтобы храниили список
        String text = "123 456 231 546 231 312 4556";

        String arrText [] = text.split(" ");
        String arrTextSort [] = text.split(" "); //В последующем это будет массив с сортированными значениями

        for (int i = 0; i < arrTextSort.length; i++) { //Тут сортируем массив arrTextSort было 321 стало 123 и т.д.

            String textIn = "";
            String arrSort [] = arrTextSort[i].split("");
            Arrays.sort(arrSort);

            for (int x = 0; x < arrSort.length; x++) {
                textIn = textIn + arrSort[x];
            }

            arrTextSort[i] = textIn;

        }

        //Создаем ArrayList для исходного варианта слов и сортированного и ниже уже полностью коприуем массивы в ArrayList
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.addAll(Arrays.asList(arrText));
        list2.addAll(Arrays.asList(arrTextSort));

        System.out.println(list1); //Проверяем скопировалось ли всё
        System.out.println(list2);

        //Пробегаемся по нашим листам и переносим всё в мапу (мы знаем, что у листа с исходнымми словами и сортированными индексы совпадают)
        for (int i = 0; i < list2.size(); i++) { //Тут без разницы: list2 или list1 (кол-во индексов у них равно)

            List<String> list3 = new ArrayList<>(); //Создаем List в который будем укладывать исходные слова, для которых сортированные слова равны

            for (int x = 0; x < list2.size(); x++) { //!!!Цикл в цикле не идеален, но работает, просто он лишний раз пробегается по тем же значениям, хотя мы по ним уже пробегались
                if (list2.get(i).equals(list2.get(x))) {
                    list3.add(list1.get(x));
                }

                map.put(list2.get(i), (ArrayList<String>) list3);

            }

        }

 //       System.out.println(map);

        //Выводим значения в мапе на печать
        for (Map.Entry entry : map.entrySet()) {

            List<String> listWithSign = (List<String>) entry.getValue();  //Просто сохраняем вывод, но у нас тут запятые и кавычки, поэтому мы должны удалить их
            //Ниже удаляем в листе все лишнии знаки (запятые и кавычки) и переводим в строку и выводим на печать
            String listWithoutSign = Arrays.toString(listWithSign.toArray()).replace("[", "").replace("]", "").replace(",", "");

            System.out.println(listWithoutSign);

        }

    }


}
