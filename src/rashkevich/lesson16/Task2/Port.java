package rashkevich.lesson16.Task2;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class Port {
	
private LinkedList<Container> storage;
private int startCapacity;
private int maxCapacity;
private String name;
private int shipCount;
private Semaphore semaphore;


public Port(String name,int startCapacity, int maxCapacity) {// for ship
	this.name=name;
	this.startCapacity=startCapacity;
	this.maxCapacity=maxCapacity;
	storage=new LinkedList<Container>();
	for (int i=0;i<startCapacity;i++) {
		Container container=new Container(name+"|"+i);
		storage.add(container);
	}
}

	public Port(String name,int startCapacity, int maxCapacity, int shipCount) {//for port shipCount=count of ships in the port at the same moment
		this.name=name;
		this.startCapacity=startCapacity;
		this.maxCapacity=maxCapacity;
		semaphore=new Semaphore(shipCount);
		storage=new LinkedList<Container>();
		for (int i=0;i<startCapacity;i++) {
			Container container=new Container(name+i);
			storage.add(container);
		}
	}

public Container takeContainerFromPort() {
	Container container=null;
	if (storage.size()>0) {
		container=storage.removeLast();
	} else {
		System.out.println("There are no containers in the "+name+".");
	}
	return container;
}

public void returnContainerInPort(Container container) {
	if (storage.size()<maxCapacity) {
		storage.add(container);
	} else {
		System.out.println(name+" is full, wait for available places!");
	}
}

public Semaphore getSemaphore() {
	return semaphore;
}

public LinkedList<Container> getStorage() {
	return storage;
}

public int getMaxCapacity() {
	return maxCapacity;
}

public String getName() {
	return name;
}

public void print() {
	storage.stream().map(s->s.getId()).forEach(System.out::println);
}

}
