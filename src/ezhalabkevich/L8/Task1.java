package ezhalabkevich.L8;
import java.util.Arrays;

public class Task1 <T> {
    public static void main(String[] args) {
        int n=1;
               Object [] array = new Object [] {1,"dog",3.5,5,-19};
        System.out.println(Vozvrat(array,n));
    }
static Object Vozvrat (Object[]mas,int index ){
        return mas[index];
}


}