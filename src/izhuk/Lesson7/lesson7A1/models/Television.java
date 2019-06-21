package src.izhuk.Lesson7.lesson7A1.models;

import src.izhuk.Lesson7.lesson7A1.Appliance;

public class Television extends Appliance {
    private int volume;

    public Television(String name, String brandName, String model, int volume){
        super(name, brandName, model);
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void TurnedOn(){
        System.out.println(super.getName() + " " + super.getBrandName() + " " + super.getModel() + " включен и вещает Киселева, прости Господи, на громкости " + this.getVolume());
    }
}

