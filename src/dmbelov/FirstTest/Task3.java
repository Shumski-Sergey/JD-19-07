package dmbelov.FirstTest;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 67, 1, 3, 8, 1, 0, 1, 1};
        int[] numberOfTimes = new int[numbers.length];
        int match;
        for (int i = 0; i < numbers.length; i++) {
            match = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    match++;
                }
            }
            numberOfTimes[i] = match;
        }
        maxOutput(numberOfTimes, numbers);
    }
    private static void maxOutput(int[] numberOfTimes, int[] numbers) {
        int max, indexMax;
        max = numberOfTimes[0];
        indexMax = 0;
        for (int i = 1; i < numberOfTimes.length; i++) {
            if (max < numberOfTimes[i]) {
                max = numberOfTimes[i];
                indexMax = i;
            }
        }
        System.out.print("Число, которое повторяется максимальное количество раз: "+numbers[indexMax]+"\n");
        System.out.print("А повторяется оно: " + max + " раз");
    }
}
