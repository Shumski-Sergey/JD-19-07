package rashkevich.lesson19.Task3;

public class ErrorController {
private Error error;
private Message message;

public void setError(Error error){
    this.error=error;
}

public void action(){
error.alert();
}
}
