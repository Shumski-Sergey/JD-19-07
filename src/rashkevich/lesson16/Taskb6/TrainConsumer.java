package rashkevich.lesson16.Taskb6;

import tolifer.L7.aboutMoney.Run;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class TrainConsumer implements Runnable {
    private LinkedList<Train> trainProducerList;
    private int trainCount;
    private TunelPool tunelPool;

    public TrainConsumer(int trainCount, TunelPool tunelPool) {
        this.trainCount = trainCount;
        this.tunelPool = tunelPool;
    }

    @Override
    public void run() {
        int trainPassedCount=0;
        while(trainPassedCount<trainCount){
            for (Tunel tunel:tunelPool.getTunelList()){
                try {
                    Train train=tunel.getTrainBlockingQueue().poll(50, TimeUnit.MILLISECONDS);
                    if (train !=null){
                        System.out.println("Consumer: Train "+train.getId()+" went out of the tonnel:"+tunel.getId()+", trains in the tonnel:"+tunel.getTrainBlockingQueue().size());
                        trainPassedCount++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Train passed total:"+trainPassedCount);
        }
    }
}
