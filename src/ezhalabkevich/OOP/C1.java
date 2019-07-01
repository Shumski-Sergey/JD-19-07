package ezhalabkevich.OOP;

public class C1 {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик", 3);
        Dog tuzik = new Dog("Тузик", 5);
        bobik.setWeight(3);
        bobik.setPower(2.3);
        tuzik.setPower(3.1);
        tuzik.setWeight(2);


    }

    public static class Dog {
        String name;
        int age;
        private int weight;
        private double power;

        public Dog(String name, int age) {
            this.age = age;
            this.name = name;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setPower(double power) {
            this.power = power;
        }

        public double getPower() {
            return power;
        }

        public int getWeight() {
            return weight;
        }

      /* boolean win(Dog otherDog) { // Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.
            double chance;

            chance = 0.2 * age + 0.3 * getWeight() + 0.5 * getPower();
            if (thisDog>otherDog)
                return true;
            else return false;
        }*/
    }
}
