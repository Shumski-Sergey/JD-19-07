package rashkevich.lesson16.Taskb6;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public class Tunel {
    private int id;
    private int trainInTunelCount;
    private BlockingQueue<Train> trainBlockingQueue;
    private final Semaphore semaphore=new Semaphore(1);

    public Semaphore getSemaphore() {
        return semaphore;
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
