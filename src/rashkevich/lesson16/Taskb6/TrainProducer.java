package rashkevich.lesson16.Taskb6;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

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
        Train train=trainProducerList.removeFirst(); System.out.println("Producer: take train "+train.getId());
           for (Tunel tunel:tunelPool.getTunelList()){
               // if (tunel.getTrainBlockingQueue().size()<tunel.getTrainInTunelCount()){

                        if((tunel.getTrainBlockingQueue().size()==0)||(tunel.getDirection()==train.getDirection())){
                            if(tunel.getTrainBlockingQueue().offer(train)){
                                System.out.println("Producer: Train "+train.getId()+" direction:"+train.getDirection()+" passed in the tonnel:"+tunel.getId()+" direction:"+tunel.getDirection()+", trains in the tonnel:"+tunel.getTrainBlockingQueue().size());
                                tunel.setDirection(train.getDirection());
                                break;
                            }
                        }

               try {
                   TimeUnit.MILLISECONDS.sleep(5);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               //}
           }
    }

    }
}
