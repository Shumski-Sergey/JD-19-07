package vgorelko.Lesson12;

import java.io.*;
import java.util.stream.Stream;

public class StreamA2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOut = reader.readLine();
        String fileIn = reader.readLine();


        String text = text(fileOut);
        String textWithNum = onlyNum(text);
        System.out.println(textWithNum);
        textIn(textWithNum, fileIn);

    }

    static String text(String fileName) {
        String textOut = "";

        //Чтение файла
        try(FileInputStream fin = new FileInputStream(fileName + ".txt"))
        {
            // System.out.printf("File size: %d bytes \n", fin.available());

            int i=-1;
            while((i=fin.read())!=-1){

                textOut = textOut+(char)i;
            }
            fin.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        System.out.println(textOut);


        return textOut;
    }

    static void textIn(String text, String fileName) {
        //Запись файла
        try(FileOutputStream fos=new FileOutputStream(fileName+".txt"))
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);

            fos.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }

    static String onlyNum(String text){

        StringBuilder stringBuilder = new StringBuilder();

        Stream.of(text.split(" ")).filter(f -> f.matches("^[0-9]+$")).forEach(x -> stringBuilder.append(x).append(" "));

        stringBuilder.setLength(stringBuilder.length() - 1);

        return String.valueOf(stringBuilder);
    }




}
