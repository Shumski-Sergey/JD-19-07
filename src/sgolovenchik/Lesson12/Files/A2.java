package sgolovenchik.Lesson12.Files;

//Стратегия:
// Получаем с консоли ссылку на нужный директорий. Считываем. Создаём массив файловой системы и папок директория.
// Определяем их даты создания. Конвертируем дату. Выводим и записываем построчно файл\папка + дата создания.

import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        System.out.println("Path Input File: ");
        Scanner in = new Scanner(System.in);
        String SomePathName = in.nextLine();//адрес файла для чтения с консоли: C:\JAVA\TaskFiles

        File pathDir ;
        File inFileTime;
        FileWriter fr ;
        String[] pathsFilesAndDir;

        try {
            pathDir = new File(SomePathName);  // создание нового объекта file
            File OutputFile = new File( "C:\\JAVA\\TaskFiles\\New Dir\\NewFile.txt");//создание нового файла
            fr = new FileWriter(OutputFile);
            pathsFilesAndDir = pathDir.list(); // Массив файлов и папок
            long FileTime; //для получения даты создания файла в формате Timestamp

            for(int i = 1; i< pathsFilesAndDir.length; i++) {

                inFileTime = new File(pathsFilesAndDir[i]);
                FileTime = inFileTime.lastModified();              //получаем в формате Timestamp
                Date date = new Date(FileTime);                    //перевод в формат даты
                System.out.println(pathsFilesAndDir[i]+" "+date);  //вывод списка файлов и каталогов с датами
                String d = date.toString();
                fr.write(pathsFilesAndDir[i]+" create on "+d+"\r\n");    //запись построчно (\r\n - перенос в блокноте)
            }
            fr.close();
        }catch(Exception e) { // если  произошла ошибка адреса файла
            e.printStackTrace();
            System.out.println("Error of pathname.");
        }
    }
}
