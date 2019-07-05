package ezhalabkevich.L14;
/*Организовать построчное считывание данных, введенных с консоли, и их запись в файл.
Признаком окончания записи (конец работы программы) является строка со словом «#ESC».
 */

import java.io.*;

public class writer {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("notes5.txt")))
        {
            // чтение построчно
            String text;
            while(!(text=br.readLine()).equals("#ESC")){

                bw.write(text + "\n");
                bw.flush();
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
