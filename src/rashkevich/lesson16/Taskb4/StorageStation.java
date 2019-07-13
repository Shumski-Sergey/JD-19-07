package rashkevich.lesson16.Taskb4;

import java.util.LinkedList;

public class StorageStation {
    private LinkedList<Station> stationList;

    public StorageStation() {
        this.stationList = new LinkedList<>();
    }

    public void addStation(Station station){
        stationList.add(station);
    }

    public LinkedList<Station> getStationList() {
        return stationList;
    }

    public void printStationsInfo(){
        stationList.stream().forEach(Station::printBusOnStationInfo);
    }

}
