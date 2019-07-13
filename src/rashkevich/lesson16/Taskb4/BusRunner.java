package rashkevich.lesson16.Taskb4;

public class BusRunner {
    public static void main(String[] args){
        StorageStation storageStation=new StorageStation();
        final int BUS_COUNT=10;
        final int STATION_COUNT=5;
        final int STATION_CAPACITY=2;

        for (int i=0;i<STATION_COUNT;i++){
            Station station=new Station(STATION_CAPACITY,i);
            storageStation.addStation(station);
        }

        for (int i=0;i<BUS_COUNT;i++){
            Bus bus=new Bus(i,storageStation);
            Thread t=new Thread(bus);
            t.start();
        }
    }
}
