package sgolovenchik.Lesson6.Task1;


class HomeEquip {
    public static void main(String[] args) {

        Works Fridge = new Works(200,"OFF");
        System.out.println("Fridge Power : " +Fridge.Power+ "  State : " +Fridge.State);

        Works Stove = new Works(1200,"OFF");
        System.out.println("Stove Power : " +Stove.Power+ "  State :" +Stove.State);


        Works Teapot = new Works(800,"OFF");
        System.out.println("Teapot Power : " +Teapot.Power+ "  Teapot State : " +Teapot.State );

        Works Dishwasher = new Works(400, "OFF");
        System.out.println("Dishwasher Power : " +Dishwasher.Power+ "  Dishwasher State : " +Dishwasher.State );

    }
}


