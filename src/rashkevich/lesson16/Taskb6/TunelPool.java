package rashkevich.lesson16.Taskb6;

import java.util.ArrayList;

public class TunelPool {
    private ArrayList<Tunel> tunels;
    private int TUNEL_COUNT=2;

    public TunelPool() {
        tunels=new ArrayList();
        for (int i=0;i<TUNEL_COUNT;i++){
            Tunel tunel=new Tunel(i);
            tunels.add(tunel);
        }
    }

    public ArrayList<Tunel> getTunels() {
        return tunels;
    }
}
