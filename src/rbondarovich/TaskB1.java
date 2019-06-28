package rbondarovich;

public class TaskB1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <10; i++) {
            int randomNumber = getRandomNumberInRange(5, 155);
            if (randomNumber > 25 && randomNumber < 100)
                System.out.println("Число " + randomNumber + " находится в интервале (25;100);");
            else System.out.println("Число " + randomNumber + " вне интервала (25;100);");
            Thread.sleep(1200);
        }
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int) (Math.random() * ((155 - 5) + 1)) + 5;
    }
}
