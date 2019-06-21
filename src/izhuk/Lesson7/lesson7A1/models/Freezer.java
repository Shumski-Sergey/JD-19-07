package src.izhuk.Lesson7.lesson7A1.models;

public class Freezer extends Fridge {
    private int numberOfСells;

    public Freezer(String name, String brandName, String model, int temperature, int numberOfСells){
        super(name, brandName, model, temperature);
        this.numberOfСells = numberOfСells;
    }

    public int getNumberOfСells(){
        return numberOfСells;
    }

    public void setNumberOfСells(int numberOfСells){
        this.numberOfСells = numberOfСells;
    }

    public void TurnedOn(){
        System.out.println(super.getName() + " " + super.getBrandName() + " " + super.getModel() + " работает. Температура " + super.getTemperature() + " градуса. Мороженое в " + this.getNumberOfСells() + " отсеке.");
    }

}
