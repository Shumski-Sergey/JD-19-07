package inikalayeva.Lesson7.A1.Service;

import inikalayeva.Lesson7.A1.model.Fridge;
import inikalayeva.Lesson7.A1.model.Microwave;
import inikalayeva.Lesson7.A1.model.WashingMachine;

public class TurnItOn {
    public static void main(String[] args) {
        Microwave microwave = new Microwave();
        Fridge fridge = new Fridge();
        WashingMachine washingMachine = new WashingMachine();

        microwave.setTurnedOn(true);
        fridge.setTurnedOn(true);
        washingMachine.setTurnedOn(true);
    }
}
