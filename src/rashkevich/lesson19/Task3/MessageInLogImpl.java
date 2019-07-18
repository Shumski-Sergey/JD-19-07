package rashkevich.lesson19.Task3;

import java.io.*;
import java.util.Date;

public class MessageInLogImpl implements Message{
    @Override
    public void info(String string) {
        String strError=string+" HAPPENED."+new Date();
        String fname="src/log.txt";
        File file=new File(fname);
        BufferedWriter bw=null;
        try {
            bw=new BufferedWriter(new FileWriter(file.getAbsolutePath(),true));
            //bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file.getAbsolutePath()),"UTF-8"));
            bw.newLine();
            bw.append(strError);
            System.out.println("Log is written in the file:"+fname);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
