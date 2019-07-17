import javax.jms.JMSException;
import java.util.Scanner;

public class MessageSenderRunner {
    public static void main(String[] args){
        String str=new String();
        MessageSender messageSender=new MessageSender();

        Scanner sc=new Scanner(System.in);
        while(!str.equals("qqq")){
            str=sc.nextLine();
            //System.out.println("Message:"+str);
            try {
                messageSender.sendingMessage(str);
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
            sc.close();

    }
}
