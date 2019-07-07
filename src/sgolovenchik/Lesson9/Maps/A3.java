package sgolovenchik.Lesson9.Maps;

import java.util.Arrays;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите слова или числа через пробел :");
        String SomeString = in.nextLine();
        System.out.println(SomeString);    // 765 45 8790 6785 54 675 0978 567

        int MaxLenght = 0; //максимальная длинна элемента массива
        String[] SplitSomeString = SomeString.split("\\s"); //разделение по пробелу
        for (int i = 0; i < SplitSomeString.length; i++) {
            System.out.println(SplitSomeString[i]);
            if (SplitSomeString[i].length() > MaxLenght ) {
                MaxLenght = SplitSomeString[i].length();
            }
           // SomeMap.put(SplitSomeString[i], "пофиг что");
        }
        System.out.println(MaxLenght);
        for (int i =2; i <= MaxLenght; i++){  //от длинны 2 до макс длинны слова

            for (int j =0; j < SplitSomeString.length; j++){

                if (SplitSomeString[j].length() == i) {
                    char[] numArr = SplitSomeString[j].toCharArray();
                    Arrays.sort(numArr);
                    System.out.print(SplitSomeString[j]+" ");
                    for (int k = j+1; k < SplitSomeString.length;  k++){

                        char[] numArr2 = SplitSomeString[k].toCharArray();
                        Arrays.sort(numArr2);
                        if(Arrays.equals(numArr, numArr2)) {
                            System.out.print(SplitSomeString[k]+" ");
                            //SplitSomeString[k] = null;
                        }

                        //повторяет уже выбранные
                        //решение: нужен изменяемый массив и после нахождения анаграмм их удалять

                    }
                    System.out.println();

                }
            }
        }
    }
}
