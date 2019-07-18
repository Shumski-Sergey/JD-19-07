package sgolovenchik.Lesson15.RegEx;

// количество открытых и закрытых скобок должно быть одинаково.
// строка вида  " )выражение( ", будет некорректно, несмотря на !равенство! количества открытых и закрытых скобок
// Стратегия:
// Условие 1. Во всей строке сумма открытых скобок  равна сумме  закрытых.
// Условие 2. Посимвольно перебирая строку, количество открытых скобок всегда должно быть больше или равно количеству закрытых.

import java.util.Scanner;

public class B1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input String:");
        String CheckString = in.nextLine();
        int CountOfOpenBracket = 0;
        int CountOfCloseBracket = 0;

        char[] CharList = CheckString.toCharArray();

             // Метод 1 ( проверяем только равенство )

            for (int i = 0; i < CheckString.length(); i++) {
                if (CharList[i] == '(') CountOfOpenBracket++;
                if (CharList[i] == ')') CountOfCloseBracket++;
            }

            if (CountOfOpenBracket == CountOfCloseBracket) {
                System.out.println("Method1: String Right.");
            }
            else { System.out.println("Method1: String Wrong.");
            }

            // Метод 2 ( проверяем равенство и последовательность открытых и закрытых скобок)

            for (int i = 0; i < CheckString.length(); i++) {
                if (CharList[i] == '(') CountOfOpenBracket++;
                if (CharList[i] == ')') CountOfCloseBracket++;
                if (CountOfCloseBracket > CountOfOpenBracket) {
                    System.out.println("Method2: String Wrong.");
                    break;
                }
                else {
                    if (i == CheckString.length()-1) {
                        if (CountOfCloseBracket == CountOfOpenBracket) {
                            System.out.println("Method2: String Right.");
                        } else {
                            System.out.println("Method2: String Wrong.");
                        }
                    }
                }
            }
        }
    }






