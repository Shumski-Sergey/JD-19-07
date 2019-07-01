package ezhalabkevich.L5;

import java.io.*;

/*Ввести n слов с консоли. Найти слово, символы в котором идут в стро-гом порядке возрастания их кодов.
Если таких слов несколько, найти первое из них.*/
public class Task6 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите кол-во строк");
        Input(); //метод для создания массива


    }
    public static void Input() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String index = bufferedReader.readLine();
        int n = Integer.parseInt(index); //знаем кол-во строк, создадим массив строк

        String[] lines = new String[n]; //объявили массив строк
        System.out.println("Введите строки");
        for (int i = 0; i < n; i++) {
            System.out.println("Строка " + (i + 1));
            lines[i] = bufferedReader.readLine(); //заполнение массива строками
        }
        int count=1;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <lines[i].length()-1; j++) {
                if(lines[i].charAt(j)<lines[i].charAt(j+1))count++;  //проверка на упорядоченность букв в строке

            }
            if(count==lines[i].length()) {System.out.println("Упорядоченное слово: "+lines[i]); break;}
            else count=1;

        }

    }
}
