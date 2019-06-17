package inikalayeva.Lesson7.A1.model;

public class Microwave extends Cooking {
    private String type;
    int power;
    String insideCoating;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getInsideCoating() {
        return insideCoating;
    }

    public void setInsideCoating(String insideCoating) {
        this.insideCoating = insideCoating;
    }
}
