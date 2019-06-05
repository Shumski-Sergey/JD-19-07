package dmbelov.Lesson3;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {

        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int masIndex=0;
        int num = number; // передал постоянное число переменной. С ней и буду работать.
        int i;

        // Выясняю длину исходного числа
        for(i=1; num >= 1; i++) {
            num /= 10;
            masIndex++;
        }

        // Создаю массив этой длины
        int [] numberList = new int[masIndex];

        // Заполняю массив исходным числом начиная с последнего индекса
        num = number;
        for (i=numberList.length-1; i>=0; i--) {
            numberList[i] = (num % 10);
            num /= 10;

        }

        int divide = masIndex / 3; // количество полных триад
        int reminder = masIndex % 3; // количество цифр в неполной триаде

        // Вывожу цифры неполной триады
        for (i=0; reminder>0; i++) {
            System.out.print(numberList[i]);
            reminder--;
        }

        System.out.print(" ");

        // Вывожу цифры полных триад
        for(int j=i; divide>0; j+=3) {
            System.out.print(numberList[j]+""+numberList[j+1]+""+numberList[j+2]+" ");
            divide--;
        }
    }
}
