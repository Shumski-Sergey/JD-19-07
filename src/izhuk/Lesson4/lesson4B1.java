package src.izhuk.Lesson4;

import java.util.Date;

public class lesson4B1 {

    public static void main(String[] args){
        String word = "word";

        getTimeConс(word);
        getTimeStrBuilder(word);
        }

    public static void getTimeConс(String word) {
        Date currentTime = new Date();
        for (int i=0;i<10000;i++){
            word = word +"word";
        }
        Date newTime = new Date();
        long delay = newTime.getTime() - currentTime.getTime();
        System.out.println("Конкатенация в милисекундах: " + delay);
    }

    public static void getTimeStrBuilder(String word) {
        Date currentTime = new Date();
        StringBuilder builder = new StringBuilder(word);
        for (int i=0;i<10000;i++){

            builder.append(word);
        }
        Date newTime = new Date();
        long delay = newTime.getTime() - currentTime.getTime();
        System.out.println("Работа StringBuilder в милисекундах: " + delay);
    }

}