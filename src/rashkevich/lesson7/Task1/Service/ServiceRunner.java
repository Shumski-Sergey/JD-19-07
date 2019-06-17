package rashkevich.lesson7.Task1.Service;

import rashkevich.lesson7.Task1.Model.Fridge;
import rashkevich.lesson7.Task1.Model.Stove;

public class ServiceRunner {
    public static void main(String[] args){
        Stove stove=new Stove("Phillips");
        stove.turnOn();
        Fridge fridge=new Fridge("Atlant");
        fridge.turnOn();
    }
}
