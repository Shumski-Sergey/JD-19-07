package sgolovenchik.Lesson3;

import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {
        Scanner in = new

                Scanner(System.in);
        System.out.println("Введите число игроков в покер (2-10):");
        int N = in.nextInt();
        System.out.println("Раздаём на " + N + " игрока(ов)");

        String[] cards = {"ячейка обмена",
                "2ка Пик", "2ка Треф", "2ка Черв", "2ка Бубен",  //базовый массив текстовых названий карт
                "3ка Пик", "3ка Треф", "3ка Черв", "3ка Бубен",  //53 ячейки, 52 карты и ячейка обмена
                "4ка Пик", "4ка Треф", "4ка Черв", "4ка Бубен",
                "5ка Пик", "5ка Треф", "5ка Черв", "5ка Бубен",
                "6ка Пик", "6ка Треф", "6ка Черв", "6ка Бубен",
                "7ка Пик", "7ка Треф", "7ка Черв", "7ка Бубен",
                "8ка Пик", "8ка Треф", "8ка Черв", "8ка Бубен",
                "9ка Пик", "9ка Треф", "9ка Черв", "9ка Бубен",
                "10ка Пик", "10ка Треф", "10ка Черв", "10ка Бубен",
                "Валет Пик", "Валет Треф", "Валет Черв", "Валет Бубен",
                "Дама Пик", "Дама Треф", "Дама Черв", "Дама Бубен",
                "Король Пик", "Король Треф", "Король Черв", "Король Бубен",
                "Туз Пик", "Туз Треф", "Туз Черв", "Туз Бубен"};


        System.out.println("Сколько раз перемешиваем карты в колоде:");
        System.out.println("Для лучшего перемешивания рекомендую ввести 100-1000");
        int count = in.nextInt();
        System.out.println("Перемешиваем " + count + " раз");

        for (int i = 1; count > i; i++) {         //count раз меняем две случайные
            int random1 = (int) (Math.random() * 53);  //карты в колоде друг на друга
            int random2 = (int) (Math.random() * 53);

            cards[0] = cards[random1];   //и меняем друг на друга через 'посредника' (ячейка обмена 0)
            cards[random1] = cards[random2];
            cards[random2] = cards[0];
        }
        for (int k = 1; k <= N; k++) { //и раздаём.. первому 1-5 карту, второму 6-10 и т.д.
            System.out.println("Игрок N " + k + " получает карты: " + cards[k * 5 - 4] +
                    ", " + cards[k * 5 - 3] + ", " + cards[k * 5 - 2] + ", " + cards[k * 5 - 1] +
                    ", " + cards[k * 5]);
        }
    }
}
