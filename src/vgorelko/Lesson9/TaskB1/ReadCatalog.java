package vgorelko.Lesson9.TaskB1;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadCatalog {

     public String ReadFile(String fileName){
       String text = "";
        try(FileInputStream fin=new FileInputStream(fileName))
        {

            int i=-1;
            while((i=fin.read())!=-1){
             text = text + String.valueOf((char)i);

            }

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
       return text;
    }

}
