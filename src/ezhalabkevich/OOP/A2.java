package ezhalabkevich.OOP;

public class A2 {
    public static void main(String[] args) {
        Dog Sharik = new Dog("Тузик", 5);


        Dog Tyzik = new Dog("Шарик ", 3);


        System.out.println(Tyzik.toString()); //Task A2
        System.out.println(Sharik.toString());
    }

    public static class Dog {
        String name;
        int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString(){
            String info;
            info="Кличка: "+name+". Возраст: "+age+".";
            return info;

        }
    }
}

