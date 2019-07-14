package rashkevich.lesson16.Taskb6;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Tunel {
    private static final long TIME_TO_WAIT = 50;
    private int idTunel;
    private LinkedBlockingDeque<Train> trains;
    private int TRAIN_IN_TUNEL_MAX_COUNT=2;
    private boolean direction;

    public Tunel(int idTunel) {
        this.idTunel = idTunel;
        trains=new LinkedBlockingDeque(TRAIN_IN_TUNEL_MAX_COUNT);
    }

    public int getIdTunel() {
        return idTunel;
    }

    public LinkedBlockingDeque<Train> getTrains() {
        return trains;
    }

    public void addTrain(Train train){
        int count=0;
        try {
            while((!trains.contains(train))||(count==10)){
                trains.offerLast(train,TIME_TO_WAIT, TimeUnit.MILLISECONDS);
                count++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Train remonveTrain(){
        Train train=null;
        try {
            train=trains.pollFirst(TIME_TO_WAIT,TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return train;
    }

    public boolean isDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }
}
