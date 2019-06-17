package inikalayeva.Lesson7.A1.model;

public class WashingMachine extends LargeScaleAppliances {
    private String uploadMethod;
    private double capacity;
    private int maximumSpinSpeed;

    public String getUploadMethod() {
        return uploadMethod;
    }

    public void setUploadMethod(String uploadMethod) {
        this.uploadMethod = uploadMethod;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getMaximumSpinSpeed() {
        return maximumSpinSpeed;
    }

    public void setMaximumSpinSpeed(int maximumSpinSpeed) {
        this.maximumSpinSpeed = maximumSpinSpeed;
    }
}
