package rashkevich.lesson16.Task1;

public class LibraryRunner {
    public static void main(String[] args){
        BookStorage storage=new BookStorage();
        Book b1=new Book("one","libr");
        Book b2=new Book("two","hand");
        Book b3=new Book("three","libr");
        Book b4=new Book("four","hand");
        Book b5=new Book("five","libr");
        Book b6=new Book("six","hand");
        Book b7=new Book("seven","libr");
        Book b8=new Book("eigth","hand");
        storage.add(b1);
        storage.add(b2);
        storage.add(b3);
        storage.add(b4);
        storage.add(b5);
        storage.add(b6);
        storage.add(b7);
        storage.add(b8);

            User user1=new User(storage,1);
            user1.addBookToWaitFor(b1);
            user1.addBookToWaitFor(b2);
            Thread u1=new Thread(user1);
            u1.start();

        User user2=new User(storage,2);
        user2.addBookToWaitFor(b1);
        user2.addBookToWaitFor(b2);
        Thread u2=new Thread(user2);
        u2.start();

        User user3=new User(storage,3);
        user3.addBookToWaitFor(b1);
        user3.addBookToWaitFor(b2);
        Thread u3=new Thread(user3);
        u3.start();

        User user4=new User(storage,4);
        user4.addBookToWaitFor(b1);
        user4.addBookToWaitFor(b2);
        Thread u4=new Thread(user4);
        u4.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        storage.printBookStorage();
    }
}
