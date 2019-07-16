package rashkevich.lesson16.Taskb2;

public class CarRunner {
    public static void main(String[] args){
        int carCount=100;
        Parking parking=new Parking(6);
        for(int i=0;i<carCount;i++){
            Car car=new Car(i,parking,(int)(Math.random()*50));
            Thread t=new Thread(car);
            t.start();
        }
    }
}
