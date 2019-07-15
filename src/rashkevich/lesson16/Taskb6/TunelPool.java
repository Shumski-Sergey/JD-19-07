package rashkevich.lesson16.Taskb6;

import java.util.ArrayList;

public class TunelPool {
    private ArrayList<Tunel> tunelList;
    private int tunelCount;
    private int trainInTunelCount;

    public TunelPool(int tunelCount, int trainInTunelCount) {
        this.tunelList =new ArrayList();
        this.tunelCount=tunelCount;
        this.trainInTunelCount=trainInTunelCount;
        for (int i=0;i<tunelCount;i++){
            Tunel tunel=new Tunel(i,trainInTunelCount);
            tunelList.add(tunel);
        }
    }

    public int getTrainInTunelCount() {
        return trainInTunelCount;
    }

    public ArrayList<Tunel> getTunelList() {
        return tunelList;
    }

    public int getTunelCount() {
        return tunelCount;
    }
}
