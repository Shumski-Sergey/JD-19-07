package rashkevich.lesson16.Task1v2;

public class BookRunner {
    public static void main(String[] args){
        Book b1=new Book(1,true);
        Book b2=new Book(2,false);
        Book b3=new Book(3,true);
        Book b4=new Book(4,false);
        Book b5=new Book(5,true);
        Storage storage=new Storage();
        storage.add(b1);
        storage.add(b2);
        storage.add(b3);
        storage.add(b4);
        storage.add(b5);

        User u1=new User(storage,1);u1.wantBookToTake(1);u1.wantBookToTake(2);
        User u2=new User(storage,2);u2.wantBookToTake(1);u2.wantBookToTake(2);
        User u3=new User(storage,3);u3.wantBookToTake(1);u3.wantBookToTake(2);
        User u4=new User(storage,4);u4.wantBookToTake(1);u4.wantBookToTake(2);
        User u5=new User(storage,5);u5.wantBookToTake(1);u5.wantBookToTake(2);
        User u6=new User(storage,6);u6.wantBookToTake(3);u6.wantBookToTake(2);
        User u7=new User(storage,7);u7.wantBookToTake(3);u7.wantBookToTake(2);

        new Thread(u1).start();
        new Thread(u2).start();
        new Thread(u3).start();
        new Thread(u4).start();
        new Thread(u5).start();
        new Thread(u6).start();
        new Thread(u7).start();
    }
}
