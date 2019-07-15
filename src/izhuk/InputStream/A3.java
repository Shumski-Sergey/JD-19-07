package src.izhuk.InputStream;

import java.io.*;

public class A3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        FileOutputStream output = null;
        try {
            output = new FileOutputStream("F:\\Java lessons\\JD-19-07\\src\\izhuk\\InputStream\\TextFile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true){
            try {
                line = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (line.equals("#ESC")){
                break;
            }
            else {
                try {
                    output.write(line.getBytes());
                    output.write(' ');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
