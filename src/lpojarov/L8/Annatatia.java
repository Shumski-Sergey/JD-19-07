package lpojarov.L8;


import java.lang.reflect.Field;

public class Annatatia {
    public static void main(String[] args) {
         Person person=new Person();

    }
    void print(Object o,Class c){
        Field[] fields=c.getDeclaredFields();
        for (Field field:fields){
          //  Annatatia[] annatations= field.getDeclaredAnnotations();
            //for (Annatatia annatation:annatations){

            System.out.println();

            }
        }



    }



@interface Shou{
    boolean value() default true;
}
class Person{
  @Shou
    String nem="Max";
    int age =18;
    //////https://www.youtube.com/watch?v=6nWhCbDpIZM
}