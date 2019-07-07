package sgolovenchik.Lesson10.Srteams;

import java.io.*;

public class A3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Path Input File: ");     //адрес файла для чтения с консоли:
        String fileName1 = reader.readLine();        // D:\\JavaProject\\TaskFiles\\File5.txt
        reader.close();
        System.out.println(fileName1);

        StringBuilder InputText = new StringBuilder();

        try {
            FileInputStream FileIn = new FileInputStream(fileName1);
            int i;
            while ((i = FileIn.read()) != -1) { //получаем байткод каждого символа пока не получим -1(окончание текста)
                InputText.append((char) i);    // конвертация каждого байткода в символ и прибавление
            }
            FileIn.close();
        } catch (Exception ex) {
            System.out.println(ex);

        }
        System.out.println();
        System.out.println("Получен текст из файла: " + InputText);
        int num = 0; //инициируем переменную для количества слов "world"

        String[] SplitInputText = InputText.toString().split("[^\\w]");
                                                    //разделил строку на массив слов
                                                    //разделитель в этом случае всё что не буква

        System.out.println("Mассив разделённых слов из текста файла: ");

        for (int i = 0; i < SplitInputText.length; i++) {
            System.out.println(SplitInputText[i]);

            if (SplitInputText[i].equals("world")){
                num++;
            }
        }
        System.out.println("Количество слов 'world' в тексте: "+num);
    }
}

