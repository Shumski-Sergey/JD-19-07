package rashkevich.lesson16.Task1;

public class LibraryRunner {
    public static void main(String[] args){
        BookStorage storage=new BookStorage();
        storage.add("book one");
        storage.add("book two");
        storage.add("book three");
        storage.add("book four");
        storage.add("book five");
        storage.add("book six");

        for (int i=1;i<8;i++){
            User user=new User(storage,i);
            Thread u=new Thread(user);
            u.start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        storage.printBookStorage();
    }
}
