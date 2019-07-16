package rashkevich.lesson16.Taskb6;

public class Train {
    private int id;
    private int direction;
    private boolean inTunel;

    public Train(int id) {
        this.id = id;
        this.inTunel=false;
        this.direction=decide();
    }

    public int decide(){
        int direction=1;
        int decide=(int)(Math.random()*100);
        if (decide>50){
            direction=2;
        }
        return direction;
    }

    public int getId() {
        return id;
    }

    public int getDirection() {
        return direction;
    }

    public boolean isInTunel() {
        return inTunel;
    }
}

