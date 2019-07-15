package rashkevich.lesson16.Taskb6;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class Tunel {
    private int id;
    private int trainInTunelCount;
    private LinkedList<Train> trains;
    private final Semaphore semaphore=new Semaphore(1);

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public Tunel(int i, int trainInTunelCount) {
        this.id=i;
        this.trainInTunelCount=trainInTunelCount;
        trains=new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public int getTrainInTunelCount() {
        return trainInTunelCount;
    }

    public LinkedList<Train> getTrains() {
        return trains;
    }
}
