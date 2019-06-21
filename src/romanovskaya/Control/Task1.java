package romanovskaya.Control;

public class Task1 {

    public static void main(String[] args) {

        // Вводим массив

        int[] nums = new int[] {0,-500,-650,87,1200,456,45};

        int x = nums[0];
        int y = nums[0];

        // Находим максимальное и минимальное значения

        for ( int i = 0; i < nums.length; i++){

            if(nums[i] >= x){
                x=nums[i];

            }
            if (nums[i] <= y){
                y = nums[i];
            }
        }

        // Находим сумму элементов


        int sum = 0;
        for ( int num : nums ){
            sum = sum + num;
        }

        System.out.println("Максимаьное число" + " " + x + "\n"+ "Минимальное число " + " " + y);
        System.out.println("Сумма всех остальных элементов:" + " " + (sum  - x -y));

    }
}
