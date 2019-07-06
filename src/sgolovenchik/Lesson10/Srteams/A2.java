package sgolovenchik.Lesson10.Srteams;

import java.io.*;

public class A2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Path Input File: ");     //адрес файла для чтения с консоли:
        String fileName1 = reader.readLine();        // D:\\JavaProject\\TaskFiles\\File1.txt
        System.out.println("Path Output File: ");    //адрес файла для записи с консоли:
        String fileName2 = reader.readLine();
        reader.close();
        //System.out.println(fileName2);

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

        String[] SplitInputText = InputText.toString().split(" ");//разделение строки на массив слов символом "пробел"

        StringBuilder OutputText = new StringBuilder();

        for (int i = 0; i < SplitInputText.length; i++) {
            if (SplitInputText[i].matches("\\d+")) { //фильтр слова на содержание только цифр

                OutputText.append(SplitInputText[i] + " ");
            }

        }
        System.out.println("Текст после фильтрации: "+OutputText);

        try {
            FileWriter writer = new FileWriter(fileName2);              //запись в файл
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(OutputText.toString());
            bufferWriter.close();
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}


