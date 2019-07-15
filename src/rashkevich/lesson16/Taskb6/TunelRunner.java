package rashkevich.lesson16.Taskb6;

public class TunelRunner {
    public static void main(String[] args){
        TunelPool tunelPool=new TunelPool(2,2);
        TrainProducer trainProducer=new TrainProducer(10,tunelPool);
        Thread producer=new Thread(trainProducer);
        producer.start();
    }
}
