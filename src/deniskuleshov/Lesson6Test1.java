package deniskuleshov;

public class Lesson61 {
    public static void main(String[] args) {
        int arr[] = {0, 4, 1, 77651, 7};
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        int total = 0;
        for (int a = 1; a < 4; a++) {
            total += arr[a];
        }
        System.out.println("Summa elementov massiva = " + total);
        System.out.println("Naimenshee: " + arr[0] + "  Naibolshee: " + arr[4]);
    }
}

