package dmbelov.FirstTest;

public class Task3version {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 67, 3, 3, 8, 1, 0, 3, 1};
        int match, maxMatch, indexMaxMatch;
        maxMatch = indexMaxMatch = 0;
        for (int i = 0; i < numbers.length; i++) {
            match = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    match++;
                }
            }
            if(maxMatch<match){
                maxMatch = match;
                indexMaxMatch = i;
            }
        }
        maxOutput(numbers, maxMatch, indexMaxMatch);
    }
    private static void maxOutput(int[] numbers, int maxMatch, int indexMaxMatch) {
        System.out.print("Число, которое повторяется максимальное количество раз: "+numbers[indexMaxMatch]+"\n");
        System.out.print("А повторяется оно: " + maxMatch + " раз");
    }
}
