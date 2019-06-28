package ezhalabkevich.L4;
import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку");

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String str = bufferedReader.readLine(); //читаем строку с клавиатуры

       // String str="пар, оправ бю... !!!";
        int index=str.length();
        int count=0;
        for(int i=0;i<index;i++){
            if (str.charAt(i)=='!'||str.charAt(i)=='.'||str.charAt(i)==','||str.charAt(i)=='-') count++;
        }
        System.out.println("Количество знаков препинания равно "+count);
    }
}
