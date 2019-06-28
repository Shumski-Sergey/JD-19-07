package src.izhuk.Lesson7.lesson7A1.models;

import src.izhuk.Lesson7.lesson7A1.Appliance;

public class Fridge extends Appliance {
    private int temperature;

    public Fridge(String name, String brandName, String model, int temperature){
        super(name, brandName, model);
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    public void TurnedOn(){
        System.out.println(super.getName() + " " + super.getBrandName() + " " + super.getModel() + " включен, продукты в безопасности. Температура внутри " + this.temperature);
    }
}
