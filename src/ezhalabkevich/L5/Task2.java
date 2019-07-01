package ezhalabkevich.L5;

import java.io.*;

/*Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.*/
public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите кол-во строк");
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String index = bufferedReader.readLine();
        // int n=Integer.getInteger(index);
        int n = Integer.parseInt(index); //знаем кол-во строк, создадим массив строк
        String[] lines = new String[n]; //объявили массив строк
        System.out.println("Введите строки");
        for (int i = 0; i < n; i++) {
            System.out.println("Строка " + (i + 1));
            lines[i] = bufferedReader.readLine(); //заполнение массива строками
        }
        String change = null;
        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < n - 1; i++) {
                if (lines[i].length() > lines[i + 1].length()) {
                    change = lines[i];
                    lines[i] = lines[i + 1];                    //сортировка по возрастанию
                    lines[i + 1] = change;

                }
            }
        }
        System.out.println("Массив строк имеет вид: ");
        for (int i = 0; i < n; i++) {
            System.out.println(lines[i]);
        }
    }
}
