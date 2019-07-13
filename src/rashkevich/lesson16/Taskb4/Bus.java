package rashkevich.lesson16.Taskb4;

import java.util.concurrent.TimeUnit;

public class Bus implements Runnable{
    private int id;
    private StorageStation storageStation;
    private int WAIT_TIME=100;

    public Bus(int id, StorageStation storageStation) {
        this.id = id;
        this.storageStation=storageStation;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        for (Station station:storageStation.getStationList()){
            parkOnStation(this, station);
        }
    }

    public void parkOnStation(Bus bus, Station station){
            while(!station.getBusList().contains(bus)){
                if (station.getBusList().size()<station.getCapacity()){
                    station.addBus(bus);
                }
            }
            System.out.println("Bus N"+this.id+" parked on station N"+station.getIdStation());
        try {
            TimeUnit.MILLISECONDS.sleep(WAIT_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            while(station.getBusList().contains(bus)){
                station.returnBus();
            }
             System.out.println("Bus N"+this.id+" left station N"+station.getIdStation());
           // storageStation.printStationsInfo();
    }
}
