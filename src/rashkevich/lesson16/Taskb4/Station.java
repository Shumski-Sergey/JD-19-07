package rashkevich.lesson16.Taskb4;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Station {
    private int idStation;
    private int capacity;
    private ConcurrentLinkedQueue<Bus> busList;

    public Station(int capacity, int idStation) {
        this.capacity = capacity;
        this.idStation=idStation;
        busList=new ConcurrentLinkedQueue<>();
    }

    public int getIdStation() {
        return idStation;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addBus(Bus bus){
        busList.add(bus);
    }

    public void returnBus(){
        Bus bus=busList.remove();
    }

    public ConcurrentLinkedQueue<Bus> getBusList() {
        return busList;
    }
    public void printBusOnStationInfo(){
        System.out.println("START STATION "+idStation+" INFO");
        busList.stream().map(s->"Bus at the"+s.getId()+ " station:"+ idStation).forEach(System.out::println);
        System.out.println("END STATION "+idStation+" INFO");
    }
}
