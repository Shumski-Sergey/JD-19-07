package vgorelko.Lesson14.TaskB1;

import java.io.*;

//Считать из одного файла текст НА РУССКОМ и НА АНГЛ. и вывести в другой.
// Нагенерить(создать) файл минимум 100мб. В репозиторий GIT не закидывать!!!!

public class TaskB1 {

    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream("newfile.txt");
            FileOutputStream fos=new FileOutputStream("newfile2.txt"))
        {
            byte[] buffer = new byte[fin.available()];
            // считываем буфер
            fin.read(buffer, 0, buffer.length);
            // записываем из буфера в файл
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }

}
