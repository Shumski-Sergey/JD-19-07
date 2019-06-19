package vgorelko.Lesson8.TaskA1;

/*Написать класс, который умеет хранить в себе массив любых типов
данных (int, long etc.). Реализовать метод, который возвращает
любой элемент массива по индексу.*/

public class TaskA1 {

    static class AllArray {

        Object arr[] = {"Hello", 2.0, 2f, 'd', 100};

        void returning() {

            for (Object i : arr) {

                System.out.println(i);

            }

        }
    }

    static class App {

        public static void main(String[] args) {

            AllArray allArray = new AllArray();

            allArray.returning();


        }

    }



}
