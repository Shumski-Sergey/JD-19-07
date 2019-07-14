package rashkevich.lesson16.Taskb6;

public class TunelRunner {
    public static void main(String[] args){
        TunelPool tunelPool=new TunelPool();
        int TRAIN_COUNT=20;
        for (int i=0;i<TRAIN_COUNT;i++){
            Train train=new Train(i,tunelPool.getTunels());
            Thread t=new Thread(train);
            t.start();
        }
        Remover remover=new Remover(TRAIN_COUNT,tunelPool.getTunels());
        Thread removerThread=new Thread(remover);
        removerThread.start();
    }
}
