package rashkevich.lesson19.Task3;

public class Runner {
    public static void main(String[] args){
        ErrorController controller=new ErrorController();
        controller.setError(new ErrorErrorImpl());
        controller.action();
        System.out.println("----------------------------------------");
        ErrorController controllerSecond=new ErrorController();
        controller.setError(new ErrorFatalImpl());
        controller.action();
    }
}
