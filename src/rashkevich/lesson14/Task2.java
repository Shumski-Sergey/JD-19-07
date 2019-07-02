package rashkevich.lesson14;

//2.  Написать программу, которая создаст текстовый файл и запишет в него
//        список файлов (путь, имя, дата создания) из заданного каталога

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Task2 {
    public static void main(String[] args){
        String dir="C:\\Users\\iland\\IdeaProjects\\JD-19-07_clone5\\src\\rashkevich\\lesson14";
        ArrayList<String> list=findFiles(dir);
        String filename="C:\\Users\\iland\\IdeaProjects\\JD-19-07_clone5\\src\\rashkevich\\lesson14\\out.txt";
        writeInFile(filename,list);
    }

    private static void writeInFile(String filename, ArrayList<String> list) {
        File file = new File(filename);
        FileWriter fw = null; // поток который подключается к текстовому файлу
        BufferedWriter bufferedWriter=null;
        try {
            fw = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fw);
            for (String s : list) {
                bufferedWriter.write(s);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static ArrayList<String> findFiles(String dir){
        ArrayList<String>list=new ArrayList<String>();
        File file=new File(dir);
        if (file.exists()){
            if (file.isDirectory()){
                File[] files=file.listFiles();
                for(int i = 0; i < files.length; i++) {
                    if(files[i].isFile()){
                        Date date = new Date(files[i].lastModified());
                        System.out.print("\n" + files[i].getPath() + " \t| " + files[i].getName() + "\t|" + date);
                        String str="\n" + files[i].getPath() + " \t| " + files[i].getName() + "\t|" + date+ "\n";
                        list.add(str);
                    }
                }
            } else {
                System.out.println("This is not a directory");
            }
        } else {
            System.out.println("Directory not found");
        }
        return list;

    }
}
