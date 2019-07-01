package ezhalabkevich.L5;

import java.io.*;

/*Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.*/
public class Task4 {
    public static int Compare(String str) {
        int len = str.length();
        int count = 0;
        int dl=1;
        char[] letter = str.toCharArray(); //строку преобразовали в массив


        char change;
        for (int j = len - 1; j >= 0; j--) {
            for (int i = 0; i < len - 1; i++) {
                if (letter[i] > letter[i + 1]) {
                    change = letter[i];
                    letter[i] = letter[i + 1];                    //сортировка по возрастанию
                    letter[i + 1] = change;

                }
            }
        }
        for (int i = 0; i <len-1 ; i++) {
            if(letter[i]!=letter[i+1]){
                dl++;
            }
        }
        System.out.println("Кол-во различных символов равно " + dl);
        return dl;


    }

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
        int[]a=new int[n]; //массив для хранения ко-ва различных символов в строке
        for (int i = 0; i <n ; i++) {
            a[i]=Compare(lines[i]);
        }
        int min=a[0]; int num=0;
        for (int i = 1; i < n; i++) {
            if(a[i]<min){
                min=a[i];               //поиск минимального количества различных символов
                num=i;}

        }

        System.out.println("Минимальное кол-во различных символов "+min+" строка имеет вид "+lines[num]);


        //
    }
}
