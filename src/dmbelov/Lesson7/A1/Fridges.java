package dmbelov.Lesson7.A1;

public class Fridges extends LargeEquipment {
    private Fridges(double height, double width, double length) {
        super(height, width, length);
    }

    private String design;
    private String coolingSystem;
    private boolean freshZone;

    private void setDesign(String design) {
        this.design = design;
    }
    private void setCoolingSystem(String coolingSystem1) {
        coolingSystem = coolingSystem1;
    }
    private void setFreshZone(boolean freshZone) {
        this.freshZone = freshZone;
    }
    private String getDesign() {
        return design;
    }
    private String getCoolingSystem() {
        return coolingSystem;
    }
    private boolean getFreshZone() {
        return freshZone;
    }

    public static void main(String[] args) {

        Fridges fridges = new Fridges(220.0, 60.0, 85.5);
        fridges.setBrand("Samsung");
        fridges.setColor("White");
        fridges.setPower(220);
        fridges.setOn(true);
        fridges.setDesign("French door");
        fridges.setCoolingSystem("Full No Frost");
        fridges.setFreshZone(true);

        Fridges fridges1 = new Fridges (185.0, 55.5, 78.0);
        fridges1.setBrand("Bosch");
        fridges1.setColor("Black");
        fridges1.setPower(220);
        fridges1.setDesign("Bottom-Freezer");
        fridges.setCoolingSystem("No Frost");
        fridges.setFreshZone(true);

        System.out.println(fridges.getBrand()+" "+fridges.getColor()+" "+fridges.getPower()+" "+fridges.getIsOn()+
                " "+fridges.getDesign()+" "+fridges.getCoolingSystem()+" "+fridges.getFreshZone());
        System.out.println(fridges1.getBrand()+" "+fridges1.getColor()+" "+fridges1.getPower()+" "+fridges1.getIsOn()+
                " "+fridges1.getDesign()+" "+fridges1.getCoolingSystem()+" "+fridges1.getFreshZone());
    }
}
