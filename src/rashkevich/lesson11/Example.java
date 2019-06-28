package rashkevich.lesson11;

public class Example {
    public static void main(String[] args){
        try { // внешний блок
            System.exit(0);// или петлю и тогда не сработает finally
            int a = (int) (Math.random() * 2) - 1;
            System.out.println("a = " + a);
             // внутренний блок
                int b = 1 / a;
                StringBuilder sbs = new StringBuilder(a);
            /*catch (NegativeArraySizeException e) {
                System.err.println("недопустимый размер буфера: " + e);
            }
        } catch (ArithmeticException e) {
            System.err.println("деление на 0: " + e);
*/
        } finally {
                System.out.println("finally after catch");
            }

    }
}
