package vgorelko.Lesson14.TaskA3;

import java.io.*;

public class TaskA3 {

    public static void main(String a[]) throws IOException {
        //создаем BufferedReader для чтения из консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем файл куда будем сохранять строки
        File file = new File("TEXT.txt");
        //создаем BufferedWriter для записи в файл
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        //чтение строк и запись их в файл
        while(true){
            String str = reader.readLine();
            if(str.equals("ESC")){
                writer.flush();
                break;
            }
            writer.write(str);
        }
        reader.close();//закрываем reader
        writer.close();//закрываем writer
    }

}
