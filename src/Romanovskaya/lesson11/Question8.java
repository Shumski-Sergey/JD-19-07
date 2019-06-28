package romanovskaya.lesson11;

public class Question8 {

    // Ситуация, когда блок finally не выполняется


    public static void main(String[] args) {
        try{
            System.out.println("Hello");
            System.exit(0);
        }
        finally {
            System.out.println("Bye");
        }
    }
}
