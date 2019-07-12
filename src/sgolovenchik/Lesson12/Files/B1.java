package sgolovenchik.Lesson12.Files;

import java.io.*;

public class B1 {
    public static void main(String[] args)  {

        try {
            File file = new File("C:\\JAVA\\TaskFiles\\New Dir\\EngRusFile.txt"); // определим длинну файла для массива
            byte[] bytes = new byte[(int)file.length()];

            FileInputStream is = new FileInputStream(new File("C:\\JAVA\\TaskFiles\\New Dir\\EngRusFile.txt")); // чтение байтов в массив

            while (is.available() > 0) {
                is.read(bytes);
            }
            is.close();

            FileOutputStream os = new FileOutputStream(new File("C:\\JAVA\\TaskFiles\\New Dir\\EngRusFile3.txt")); //  запись байтов в файл

            for (int i =1; i < 500000; i++){  //генерим файл из повторов (117 Мб)
            os.write(bytes);}
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error of pathname or filename.");
        }
    }
}
