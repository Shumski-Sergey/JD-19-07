package sgolovenchik.Lesson13.Threads.Parking;


public class  Car implements Runnable {

    private int n = 0; //счётчик машин
    private int CountOfParkingPlaces = 10;
    private Thread Lots[] = new Thread[CountOfParkingPlaces + 1];


    public void run() {


        n++;



        System.out.print("New ");
        Thread.currentThread().setName("Car#" + n);
        System.out.println(Thread.currentThread().getName() + " coming to the parking..");


        int CountFree = 0;
        for (int i = 0; i <= CountOfParkingPlaces; i++) {
            if (Lots[i] == null) {
                CountFree++;
            }  //Счётчик свободных мест
        }

        if (CountFree == 0) {
            System.out.println("For " + Thread.currentThread().getName() + " All Places is Busy." + Thread.currentThread().getName() + " go away.");
            //Thread.currentThread().interrupt();
        }


        System.out.println("______PARKING_______");
        for (int j = 0; j < CountOfParkingPlaces; j++) {
            if (Lots[j] != null) {
                System.out.print("|#" + (j + 1) + ": " + (Lots[j].getName()) + "|");
            } else {
                System.out.print("|#" + (j + 1) + "\033[36m Free\033[29m|");
            }
        }

        System.out.println("\n____WaitingPlace____");
        if (Lots[CountOfParkingPlaces] == null) {
            System.out.println("\033[36mFree\033[29m");
        } else {
            System.out.println("Busy by" + (Lots[CountOfParkingPlaces].getName()));
        }
        System.out.println("____________________\n");

        try {
            for (int k = 0; k <= CountOfParkingPlaces; k++) {
                if (Lots[k] == null) {
                    System.out.println("Car# " + n + " going to place#" + (k + 1));
                    Lots[k] = Thread.currentThread();

                    int TimeSt = (((int) (Math.random() * 60000)) + 5000);//время стоянки (от 3 до 20 сек)
                    Lots[k].sleep(TimeSt);


                    if (k == CountOfParkingPlaces && Lots[CountOfParkingPlaces] != null) {
                        //Lots[CountOfParkingPlaces].notify();
                        Lots[CountOfParkingPlaces].sleep(5000); //время ожидания свободного места
                    }
                    break;

                }
            }




                for (int k = 0; k < CountOfParkingPlaces; ) {
                    //System.out.println(Lots[k].getState());

                    if (Lots[k].isAlive()) {
                        k++;
                    } else {
                        System.out.println(Lots[k].getName() + " Leave Parking");
                        //Lots[k].interrupt();
                        Lots[k] = null;
                        Lots[k] = Lots[CountOfParkingPlaces];
                        //Lots[CountOfParkingPlaces].interrupt();
                        Lots[CountOfParkingPlaces] = null;
                    }

                }
        } catch (InterruptedException e) {
            System.out.println("Thread  interrupted");




            }
        }
    }








