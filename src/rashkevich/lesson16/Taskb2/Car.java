package rashkevich.lesson16.Taskb2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Car implements Runnable{
    private int id;
    private Parking parking;
    private int waitingTime;

    public Car(int id, Parking parking, int waitingTime) {
        this.id = id;
        this.parking=parking;
        this.waitingTime=waitingTime;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        tryToPark();
    }

    public void tryToPark(){
        try {
            parking.getSemaphore().tryAcquire(60, TimeUnit.MILLISECONDS);//wait 10 seconds
                parking.park(this);
                if(parking.getCarList().contains(this)){
                    System.out.println("Car "+this.id+" parked");
                    TimeUnit.MILLISECONDS.sleep(waitingTime);
                    parking.leaveParking(this);
                System.out.println("Car "+this.id+" left parking");
                }
            parking.getSemaphore().release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
