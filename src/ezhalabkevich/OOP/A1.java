package ezhalabkevich.OOP;

/*Геттеры и сеттеры для класса Dog

        Создайте class Dog.
        У собаки должна быть кличка String name и возраст int age.
        Создайте геттеры и сеттеры для всех переменных класса Dog.

        Требования:
        1. Программа не должна считывать данные с клавиатуры.
        2. У класса Dog должна быть переменная name с типом String.
        3. У класса Dog должна быть переменная age с типом int.
        4. У класса должен сеттер для переменной name.
        5. У класса должен геттер для переменной name.
        6. У класса должен сеттер для переменной age.
        7. У класса должен геттер для переменной age.
        8. Создайте внутри метода main (класса TaskA1) две разных собаки (т.е. два объекта типа Dog)
        9. Заполните поля собак используя сеттеры.
        Первая - Шарик, 5 лет. Вторая - Тузик, 3 года.
        10. Напечатайте этих двух собак, выводите собак в формате
        Кличка Возраст
        через пробел. При выводе обязательно иcпользуйте геттеры.

        Ожидается вывод:
        Шарик 5
        Тузик 3
        */
public class A1 {
    public static void main(String[] args) {
        Dog Sharik = new Dog();
        Sharik.setName("Шарик");
        Sharik.setAge(5);

        Dog Tyzik = new Dog();
        Tyzik.setAge(3);
        Tyzik.setName("Тузик");

        System.out.println(Sharik.getName() + " " + Sharik.getAge()); //Task A1
        System.out.println(Tyzik.getName() + " " + Tyzik.getAge());
        System.out.println(Tyzik.toString()); //Task A2
        System.out.println(Sharik.toString());




    }

    public static class Dog {
        String name;
        int age;
        public Dog(){
            //this.name=name;                 //конструктор класса
           // this.age=age;
        }

       public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString() {
            String info;
            info = "Кличка: " + name + " Возраст: " + Integer.toString(age);
            return info;
        }
    }



}
