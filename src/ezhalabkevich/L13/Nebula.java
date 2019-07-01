package ezhalabkevich.L13;
import java.time.LocalDate;


public class Nebula {
    public static void main(String[] args) {
LocalDate date = LocalDate.now();
        System.out.println("Полетим? Ответ: "+isDateOdd(date));


    }
    public static boolean isDateOdd(LocalDate date){
        boolean odd=false;
        if(date.getDayOfYear()%2!=0) odd=true;

        return odd;
    }
}
