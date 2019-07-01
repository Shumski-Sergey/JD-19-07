package ezhalabkevich.L5;

import java.io.*;

public class Task1_method {

    public void lines(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Строка " + (i + 1));
           // lines[i] = bufferedReader.readLine(); //заполнение массива строками
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Введите кол-во строк");
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String index = bufferedReader.readLine();
        int n = Integer.parseInt(index); //знаем кол-во строк, создадим массив строк
        String[] lines = new String[n]; //объявили массив строк
        System.out.println("Введите строки");
    }
}
