package dmbelov.FirstTest;

public class Task1 {
    public static void main(String[] args) {
        int [] numbers = {5,67,-100,156,3000};
        minMax(numbers);
    }
    private static void minMax(int [] numbers){
        int min, max, indexMin, indexMax;
        min = max = numbers[0];
        indexMin = indexMax = 0;
        for(int i=1; i<numbers.length; i++){
            if(min>numbers[i]){
                min=numbers[i];
                indexMin = i;
            }
            if(max<numbers[i]){
                max=numbers[i];
                indexMax = i;
            }
        }
        System.out.println("Минимальное значение: " + numbers[indexMin]);
        System.out.println("Максимальное значение: " + numbers[indexMax]);
        restNumbers(numbers, min, max);
    }
    private static void restNumbers(int [] numbers, int min, int max){
        int sum = 0;
        for (int n:numbers) {
            sum+=n;
        }
        sum = sum - min - max;
        System.out.println("Сумма остальных чисел = " + sum);
    }
}
