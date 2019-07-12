package rashkevich.lesson16.Taskb2;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class Parking {
private int countPlaces;
private LinkedList<Car> carList;
private Semaphore semaphore;

    public Parking(int countPlaces) {
        this.countPlaces = countPlaces;
        semaphore=new Semaphore(countPlaces);
        carList=new LinkedList<Car>();
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public synchronized void park(Car car){
        if (carList.size()<countPlaces){
            carList.add(car);
        } else {
            System.out.println("No free places");
        }
        print();
    }

    public synchronized void leaveParking(Car car){
        carList.remove(car);
        System.out.println("Parking: Car "+car.getId()+" leaves parking");
        print();
    }

    public void print(){
        System.out.println("------Parking-info-------");
        carList.stream().map(car->car.getId()).forEach(System.out::println);
        System.out.println("------Parking-info-end---");
    }

    public LinkedList<Car> getCarList() {
        return carList;
    }
}
