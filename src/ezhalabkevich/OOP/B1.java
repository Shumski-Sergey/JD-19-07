package ezhalabkevich.OOP;

public class B1 {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];

        dogs[0] = new Dog("Шарик", 1);   //Массив объектов
        dogs[1] = new Dog("Жучка", 2);
        dogs[2] = new Dog("Бобик", 3);
        dogs[3] = new Dog("Барбос", 4);
        dogs[4] = new Dog("Полкан", 5);

        DogHelper.printAllNames(dogs);
        DogHelper.averageAge(dogs);

    }


    public static class Dog {
        String name;
        int age;

        Dog(String name, int age) {
            this.age = age;
            this.name = name;

        }
    }

    public static class DogHelper {
        static void printAllNames(Dog[] dogs) {
            for (int i = 0; i < dogs.length; i++) {
                System.out.print(" " + dogs[i].name);
            }
            System.out.println("");
        }

        static double averageAge(Dog[] dogs) {
            double avg = 0;
            for (int i = 0; i < dogs.length; i++) {
                avg += dogs[i].age;
            }
            avg /= dogs.length;
            System.out.println(avg);
            return avg;
        }

    }
}
