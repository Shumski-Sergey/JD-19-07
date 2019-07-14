package rashkevich.lesson16.Taskb6;

import java.util.ArrayList;

public class Train implements Runnable{
    private static final int PERCENT = 100;
    private int idTrain;
    private boolean direction;
    private ArrayList<Tunel> tunels;

    public Train(int idTrain, ArrayList<Tunel>tunels) {
        this.idTrain = idTrain;
        this.tunels=tunels;
        this.direction=getDirection();
    }

    private boolean getDirection() {
        direction=false;
        int decision=(int)(Math.random()*PERCENT);
        if (decision<50){
            direction=true;
        }
        return direction;
    }

    public int getIdTrain() {
        return idTrain;
    }

    public boolean isDirection() {
        return direction;
    }

    @Override
    public void run() {
        chooseTunel();
    }

    private void chooseTunel() {
        for (Tunel tunel:tunels){
            if (tunel.getTrains().size()==0){
                tunel.addTrain(this);
                tunel.setDirection(this.direction);
                System.out.println("Train "+this.idTrain+", direction:"+this.direction+" passed into the tonnel "+tunel.getIdTunel()+", train balance:"+tunel.getTrains().size());
                break;
            }

            if ((tunel.getTrains().size()<2)&&(tunel.getTrains().size()>0)){
                if(tunel.isDirection()==this.direction){
                    //tunel.addTrain(this);
                    tunel.getTrains().addLast(this);
                    System.out.println("Train "+this.idTrain+", direction:"+this.direction+" passed into the tonnel "+tunel.getIdTunel()+", train balance:"+tunel.getTrains().size());
                }
            }
        }


    }
}
