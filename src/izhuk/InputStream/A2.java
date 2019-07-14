package src.izhuk.InputStream;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class A2 {
    public static void main(String[] args) {

        File folder = new File("F:\\TestFolder\\");
        File[] folders = folder.listFiles();
        File file = new File("F:\\Java lessons\\JD-19-07\\src\\izhuk\\InputStream\\FolderInfo.txt");
        FileOutputStream output = null;
        String[] str = new String[folders.length];
        byte[] info = new byte[1000];
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            output = new FileOutputStream("F:\\Java lessons\\JD-19-07\\src\\izhuk\\InputStream\\FolderInfo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < folders.length; i++) {
            StringBuilder builder = new StringBuilder();
            if (folders[i].isFile() && folders[i] != null) {
                try {
                    builder.append(folders[i].getCanonicalPath()).append(" - ").append(folders[i].getName()).append(" - ").append(new Date(folders[i].lastModified()).toString()).append("\r\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                str[i] = builder.toString();
                info = str[i].getBytes();
            }
            try {
                output.write(info);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        try {
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

