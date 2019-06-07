package rbondarovich;

public class PrintThread extends Thread {
    String name;
    int timeSleep;
    PrintThread(String s, int timeSleep){
        this.name = s;
        this.timeSleep = timeSleep;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Print " + name);
            try {
                Thread.sleep(timeSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
