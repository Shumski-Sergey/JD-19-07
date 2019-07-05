package ezhalabkevich.L14;

import java.io.*;

/* Написать программу, которая создаст текстовый файл и запишет в него список файлов (путь, имя, дата создания) из заданного каталога.*/
public class info {
    public static void main(String[] args) throws IOException {

        File dir = new File("D://ezhalabkevich");
        File file = new File("D://ezhalabkevich", "info.txt");
        FileWriter fileWriter = new FileWriter(new File("D://ezhalabkevich/info.txt"));
        if (file.canWrite()){
            if (dir.isDirectory()){
                dir.listFiles();
                System.out.println("создали массив файлов");
            }
            for (File items:dir.listFiles()) {
                fileWriter.write(items.getPath()+" ");
                fileWriter.write(items.getName()+" ");
                fileWriter.write(items.lastModified()+" ");
                fileWriter.write("*-*-*-*-*-*\n");
                System.out.println("пишем");
            }
            fileWriter.close();
        }
    }
}
