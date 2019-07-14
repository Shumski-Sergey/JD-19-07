package src.izhuk.InputStream;

import java.io.*;


public class B1 {
    public static void main(String[] args) {
        File file = new File("F:\\Java lessons\\JD-19-07\\Test.txt");
        FileInputStream input = null;
        InputStreamReader inputReader = null;
        FileOutputStream output = null;
        OutputStreamWriter outWriter = null;
        int read;
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            input = new FileInputStream("F:\\Java lessons\\JD-19-07\\TextFile.txt");
            inputReader = new InputStreamReader(input, "UTF-8");
            output = new FileOutputStream("F:\\Java lessons\\JD-19-07\\Test.txt", true);
            outWriter = new OutputStreamWriter(output, "UTF-8");
            char[] c = new char[input.available()];
            while ((read = inputReader.read(c,0,input.available())) > 0) {
                while (file.length() < 1e+8){
                    outWriter.write(c, 0, read);}
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
