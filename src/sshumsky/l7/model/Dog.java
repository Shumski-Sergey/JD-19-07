package sshumsky.l7.model;

public class Dog extends Animal {
    private int age;
    private double power;
    private int wight;

//    public Dog(String name, int age, double power, int wight) {
//        this.name = name;
//        this.age = age;
//        this.power = power;
//        this.wight = wight;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }
}
