package rashkevich.lesson19.Task3;

public class MessageDirCallImpl implements Message{
    @Override
    public void info(String string) {
        System.out.println("Make call to Principal:"+string);
    }

}
