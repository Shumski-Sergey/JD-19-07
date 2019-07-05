package ezhalabkevich.L14;

import java.io.*;

/*Считать из одного файла текст НА РУССКОМ и НА АНГЛ. и вывести в другой. Нагенерить(создать) файл минимум 100мб. В репозиторий GIT не закидывать!!!!*/
public class B1 {
    public static void main(String[] args) throws IOException {

        try {

            FileInputStream input = new FileInputStream("D://ezhalabkevich/text1.txt");

            FileOutputStream output =new FileOutputStream("D://ezhalabkevich/text2.txt");
            byte[] b = new byte[1024];
            int c = 0;

            while ((c = input.read(b)) >= 0) output.write(b,0,c);

            input.close();

            output.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
