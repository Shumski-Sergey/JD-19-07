package rashkevich.lesson16.Task2;

import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;

public class Ship extends Port implements Runnable{
	private Semaphore semaphore;
	private Port port;
	
	public Ship(String name, int startCapacity, int maxCapacity, Port port) {
		super(name, startCapacity, maxCapacity);
		this.port=port;
		this.semaphore=port.getSemaphore();
	}
	
	public Semaphore getSemaphore() {
		return semaphore;
	}

//	public void setSemaphore(Semaphore semaphore) {
//		this.semaphore = semaphore;
//	}
	
	@Override
	public void run() {
		try {
			semaphore.acquire();
			randomOperation();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		semaphore.release();
	}
	
	public void randomOperation() {
		int random=(int)(Math.random()*3+1);
		for (int i=0;i<random;i++) {
			returnContainerFromShip();
			getContainerOnShip();
		}
	}
	
	public void getContainerOnShip() {
		int i=1;
		int j=0;
		while (i==1) {
			try {
				Container container=port.takeContainerFromPort();
				if (getStorage().size()<getMaxCapacity()) {
					if (container!=null) {
						getStorage().add(container);
						i=0;
						System.out.println(getName()+" get container:"+container.getId()+" on board");
					}
				}
			} catch(NoSuchElementException e) {
				System.out.println("Ship "+getName()+" waits for the container");
				j++;
				if (j==10) {
					System.out.println("Ship "+getName()+" cannot wait.");
					break;
				}
			}
		}
	}
	
	public void returnContainerFromShip() {
		if(getStorage().size()>0) {
			Container container=getStorage().removeFirst();
			port.returnContainerInPort(container);
			System.out.println(getName()+" return "+container.getId()+" in port");
		}
	}

}
