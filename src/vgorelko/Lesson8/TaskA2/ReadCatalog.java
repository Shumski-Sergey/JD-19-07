package vgorelko.Lesson8.TaskA2;

import java.io.*;
public class ReadCatalog {

     public String ReadFile(String fileName){
       String text = "";
        try(FileInputStream fin=new FileInputStream(fileName))
        {

            int i=-1;
            while((i=fin.read())!=-1){
             text = text + String.valueOf((char)i);

            }

         //   System.out.print(text);

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
       return text;
    }

}
