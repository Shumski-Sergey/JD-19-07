package rashkevich.lesson16.Taskb6;

import java.util.LinkedList;
import java.util.logging.Logger;

public class TrainProducer implements Runnable{
    private LinkedList<Train> trainProducerList;
    private int trainCount;
    private TunelPool tunelPool;

    public TrainProducer(int trainCount, TunelPool tunelPool) {
        this.trainCount = trainCount;
        this.tunelPool=tunelPool;
        trainProducerList=new LinkedList<>();
        for (int i=0;i<trainCount;i++){
            Train train=new Train(i);
            trainProducerList.add(train);
        }
    }

    @Override
    public void run() {

    while(trainProducerList.size()!=0){
        Train train=trainProducerList.remove(); System.out.println("take train "+train.getId());
           for (Tunel tunel:tunelPool.getTunelList()){
                if (tunel.getTrains().size()<tunel.getTrainInTunelCount()){
                    if(tunel.getTrains().add(train)){
                        System.out.println("Train "+train.getId()+" went into the tonnel:"+tunel.getId()+"trains in the tonnel:"+tunel.getTrains().size());
                        break;
                    } else{
                        trainProducerList.add(train);
                        System.out.println("Train "+train.getId()+" return in queue");
                    }
                }
           }
    }

    }
}
