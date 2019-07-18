package rashkevich.lesson19.Task3;

public class MessageCEOImpl implements Message {
    @Override
    public void info(String string) {
        System.out.println("Make sms to CEO. "+string+" HAPPENED");
    }
}
