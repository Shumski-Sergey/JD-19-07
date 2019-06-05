package vgorelko.Lesson4;

public class TaskB1 {

    public static void main(String[] args) {

        long startTime1 = System.currentTimeMillis();

        String text1 = "Сложение строк ";

        for (int i = 0; i < 1000; i++) {
            text1 = text1 + "Сложение строк ";
        }

        long timeSpent1 = System.currentTimeMillis() - startTime1;
        System.out.println("программа String выполнялась " + timeSpent1 + " миллисекунд");


        long startTime2 = System.currentTimeMillis();

        StringBuilder text2 = new StringBuilder("Сложение строк ");

        for (int i = 0; i < 1000; i++) {
            text2.append("Сложение строк ");
        }

        long timeSpent2 = System.currentTimeMillis() - startTime2;
        System.out.println("программа StringBuilder выполнялась " + timeSpent2 + " миллисекунд");


    }

}
