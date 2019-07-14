package rashkevich.lesson16.Taskb6;

import java.util.ArrayList;

public class Remover implements Runnable{
    private int train_count;
    private ArrayList<Tunel> tunels;

    public Remover(int train_count, ArrayList<Tunel> tunels) {
        this.train_count=train_count;
        this.tunels=tunels;
    }

    @Override
    public void run() {
        int removedTrainCount=0;
        while(removedTrainCount<train_count){
            for(Tunel tunel:tunels){
                if(tunel.getTrains().size()>0){
                    Train train = tunel.remonveTrain();
                    System.out.println("Train "+train.getIdTrain()+", direction:"+ train.isDirection()+" went away from tonnel "+tunel.getIdTunel()+", train balance:"+tunel.getTrains().size());
                    removedTrainCount++;
                    System.out.println("Total train passes:"+removedTrainCount);
                }
            }
        }
    }
}
