package rashkevich.lesson19.Task3;

public class ErrorErrorImpl implements Error{
    @Override
    public void alert() {
        String error="ERROR";
        Message messageCEO=new MessageCEOImpl();
        messageCEO.info(error);
        Message messageConsol=new MessageConsole();
        messageConsol.info(error);
    }
}
