package ezhalabkevich.L5;

import java.io.*;

/*Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.*/
public class Task1 {
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
        String min = lines[0];
        String max=lines[0];
        for (int i=0;i<n;i++){
            if (lines[i].length()<min.length()){
                min=lines[i];
            }else if(lines[i].length()>max.length()){
                max=lines[i];
            }
        }
        System.out.println("Максимальная строка: "+max+" ее длина: "+max.length());
        System.out.println("Минимальная строка: "+min+" ее длина: "+min.length());

        String str = bufferedReader.readLine();
    }
}
