//B1. Считать из одного файла текст НА РУССКОМ и НА АНГЛ.
//        и вывести в другой. Нагенерить(создать) файл минимум 100мб.
//        В репозиторий GIT не закидывать!!!!

import java.io.*;
import java.nio.channels.FileChannel;

public class Task4 {
    public static void main(String[] args){
        String fname="src/text.txt";
        String fnameOut="src/outtext.txt";
        File f=new File(fname);
        File fout=new File(fnameOut);
        System.out.println(f.getAbsolutePath()+"---"+fout.getAbsolutePath());
        String str=new String();

        BufferedReader br=null;
        BufferedWriter bw=null;
        int size=1024*1000*100;
        try {
             br=new BufferedReader(new InputStreamReader(new FileInputStream(f.getAbsolutePath()),"UTF-8"));
             bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fout.getAbsolutePath()),"UTF-8"));
             while (fout.length()<size){
                br.mark(size);
             while((str=br.readLine())!=null){
                str=str;
                bw.append(str);
                bw.newLine();
             }
                br.reset();
             }

            System.out.println(fout.length());
//            FileChannel in = new RandomAccessFile("src/text.txt", "r").getChannel();
//            FileChannel out=new RandomAccessFile("src/outtext.txt","rw").getChannel();
//            out.transferFrom(in,0,Long.MAX_VALUE);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
