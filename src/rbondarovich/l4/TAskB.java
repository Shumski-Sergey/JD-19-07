package rbondarovich.l4;

public class TAskB {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String s1 = "a";
        for (int i = 0; i < 100000; i++) {
            s1 += "a";
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("цикл выполнялся " + timeSpent + " миллисекунд");

        long startTime2 = System.currentTimeMillis();
        StringBuilder s2 = new StringBuilder("b");
        for (int i = 0; i < 100000; i++) {
            s2.append("b");
        }
        long timeSpent2 = System.currentTimeMillis() - startTime2;
        System.out.println("цикл выполнялся " + timeSpent2 + " миллисекунд");
    }
}
