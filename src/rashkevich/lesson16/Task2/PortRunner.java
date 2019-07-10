package rashkevich.lesson16.Task2;

public class PortRunner {

	public static void main(String[] args) {
		int shipCount=3; // 
		Port port=new Port("Port", 0, 4,shipCount);
		for (int i=0;i<7;i++) {
			String s="ship"+i;
			Ship ship=new Ship(s, 3, 3, port);
			Thread t=new Thread(ship);
			t.start();
		}
		port.print();
	}

}
