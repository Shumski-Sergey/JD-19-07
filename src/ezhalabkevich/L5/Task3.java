package ezhalabkevich.L5;

import java.io.*;

/*Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.*/
public class Task3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите кол-во строк");
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

        int sumLen=0;
        for (int i=0;i<n;i++){
            sumLen+=lines[i].length();
                    }
        double  middleLen=sumLen/n;
        System.out.println("Средняя длина строк "+middleLen);
        for (int i = 0; i <n ; i++) {
            if (lines[i].length()>middleLen){
                System.out.println(lines[i]+" длина: "+lines[i].length());
            }
        }
    }
}
