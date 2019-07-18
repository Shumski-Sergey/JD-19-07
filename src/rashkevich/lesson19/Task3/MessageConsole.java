package rashkevich.lesson19.Task3;

public class MessageConsole implements Message{
    @Override
    public void info(String string) {
        System.out.println("Message in console: "+string);
    }
}
