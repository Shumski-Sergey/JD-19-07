package romanovskaya.lesson11;

public class Question16 {

    // Поведение оператора return в catch и finally


    public int doMethod(){
        try{
            throw new Exception();
        }
        catch (Exception ex){
            return 5;
        }
        finally {
            return 10;
        }
    }

    public static void main(String[] args) {
        Question16 test = new Question16();
        int surprise = test.doMethod();
        System.out.println("Returning number is " + " "+surprise);
    }
}
