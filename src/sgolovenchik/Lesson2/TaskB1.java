package sgolovenchik.Lesson2;

public class TaskB1 {

    public static void main(String[] args) {
        int min = 5, max = 155; //диапазон рандома (крайние входят)
        int min1 = 25, max2 = 100; //диапазон проверки (крайние не входят)
        int random = (int) (min + Math.random() * (max - min + 1));
        if (min1 < random && random < max2) {
            System.out.print("Случайное число " + random + " входит в диапазон.");
        } else {
            System.out.print("Случайное число " + random + " НЕ входит в диапазон.");
        }

    }
}
