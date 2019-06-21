package romanovskaya.Lesson3;


public class B1 {
    public static void main(String[] args) {
      int a = 1234567;
      int s = 0;
      while ( a !=0){
          s = a %1000;
          a = a /1000;
          System.out.print(s + " ");
      }
        System.out.println();
    }
}
