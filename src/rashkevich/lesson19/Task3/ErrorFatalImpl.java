package rashkevich.lesson19.Task3;

public class ErrorFatalImpl implements Error{
    @Override
    public void alert() {
        String error="FATAL ERROR";
        Message messageCEO=new MessageCEOImpl();
        messageCEO.info(error);
        Message directorCall=new MessageDirCallImpl();
        directorCall.info(error);
        Message messageFile=new MessageInLogImpl();
        messageFile.info(error);
    }
}
