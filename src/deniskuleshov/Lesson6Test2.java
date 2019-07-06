package deniskuleshov;

import java.util.Scanner;

public class Lesson62 {

    public static void main(String[] args){
        System.out.println("Введите число от 1 до 12");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();

        if((i>=1)&&(i<=12)){
            switch(i){
                case 1: System.out.println("Январь");
                    break;

                case 2: System.out.println("Фераль");
                    break;

                case 3: System.out.println("Март");
                    break;

                case 4: System.out.println("Апрель");
                    break;

                case 5: System.out.println("Май");
                    break;

                case 6: System.out.println("Июнь");
                    break;

                case 7: System.out.println("Июль");
                    break;

                case 8: System.out.println("Август");
                    break;

                case 9: System.out.println("Сентябрь");
                    break;

                case 10: System.out.println("Октябрь");
                    break;

                case 11: System.out.println("Ноябрь");
                    break;

                case 12: System.out.println("Декабрь");
                    break;

            }
        }else {
            System.out.println("Неверно введен месяц");
        }
    }
}
