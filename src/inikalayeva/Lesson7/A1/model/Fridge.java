package inikalayeva.Lesson7.A1.model;

public class Fridge extends LargeScaleAppliances {
    private String construct;
    private String coolingSystem;

    @Override
    void TurningOn(){
        setTurnedOn(true);
    }

    public String getConstruct() {
        return construct;
    }

    public void setConstruct(String construct) {
        this.construct = construct;
    }

    public String getCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
    }
}
