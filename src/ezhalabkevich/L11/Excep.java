package ezhalabkevich.L11;

public class Excep {
    public static void main(String[] args) {

        String s;
        System.out.println(Ex());


    }

    public static  String Ex (){
        try{
            System.out.println("Внутри try");
            java.lang.Exception e;
            return "try";


        }catch(java.lang.Exception e){
            System.out.println("Внутри catch");
            return "catch";



        }
        finally{
            System.out.println("  внутри  finally");
            return "finally";
        }
    }
}
