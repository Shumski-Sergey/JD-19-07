package sgolovenchik.Lesson13.Threads.Parking;


    public  class Parking {
        public static void main(String[] args) throws Exception {
            Car car = new Car();
            for (int i = 1; i <= 100 ; i++) {  //генерим машины (количество/номер потока/машины )
                Thread t = new Thread(car);
                Thread.sleep((int) (Math.random() * 5000)); //случайный интервал прибытия новых машин на паркинг
                t.start();

            }
        }
    }

