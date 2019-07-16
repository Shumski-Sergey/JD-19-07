package rashkevich.lesson16.Taskb6;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public class Tunel {
    private int id;
    private int trainInTunelCount;
    private BlockingQueue<Train> trainBlockingQueue;
    private int direction; //0-no direction, 1,2 -two different directions

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }


    public Tunel(int i, int trainInTunelCount) {
        this.id=i;
        this.trainInTunelCount=trainInTunelCount;
        trainBlockingQueue =new ArrayBlockingQueue<Train>(trainInTunelCount);
    }

    public int getId() {
        return id;
    }

    public int getTrainInTunelCount() {
        return trainInTunelCount;
    }

    public BlockingQueue<Train> getTrainBlockingQueue() {
        return trainBlockingQueue;
    }
}
