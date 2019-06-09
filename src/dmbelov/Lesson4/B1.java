package dmbelov.Lesson4;

public class B1 {
    public static void main(String[] args) {

        String str1 = "Не узнаешь пока ";
        String str2 = "не попробуешь";

        long startTime1,startTime2,stopTime1,stopTime2;

        startTime1 = System.currentTimeMillis();

        for(int i=1; i<=10000; i++) {
            str1=str1.concat(str2);
        }

        stopTime1 = System.currentTimeMillis();
        long time1 = stopTime1 - startTime1;

        startTime2 = System.currentTimeMillis();
        for (int j=1; j<=10000; j++){
            StringBuilder s = new StringBuilder();
            s.append(str1).append(str2);
        }

        stopTime2 = System.currentTimeMillis();
        long time2 = stopTime2 - startTime2;

        System.out.print("String adding: "+ time1+"     "+"StringBuilder: "+ time2+"    "+ "Difference: " + (time2-time1));

    }
}
