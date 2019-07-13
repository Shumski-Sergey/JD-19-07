package rashkevich.lesson16.Task1;


import java.util.LinkedList;
import java.util.NoSuchElementException;


public class User implements Runnable{
    private LinkedList<Book> bookListLibruary;
    private LinkedList<Book> bookListOnHand;
    private LinkedList<Book> bookListToWait;
    private BookStorage storage;
    private int id;
    public void print(){
        System.out.println("User has books:");
        bookListLibruary.stream().forEach(s->System.out.println(s.getName()+" "+s.getPlaceToRead()));
        bookListOnHand.stream().forEach(s->System.out.println(s.getName()+" "+s.getPlaceToRead()));
        System.out.println("---------------");
    }

    public void addBookToWaitFor(Book book){
        bookListToWait.add(book);
    }

    public User(BookStorage storage, int id){
        this.storage=storage;
        this.id=id;
        bookListLibruary =new LinkedList<>();
        bookListOnHand=new LinkedList<>();
        bookListToWait=new LinkedList<>();
    }

    @Override
    public void run() {
        for (Book book:bookListToWait){
        getBook(book);
        }

        for (Book book:bookListLibruary){
        returnBook(book);
        }
    }

    public void returnBook(Book book) {
        storage.add(book);
        System.out.println("User "+id+" returned "+book.getName()+" "+book.getPlaceToRead());
//        int i=1;
//        while (bookListLibruary.size()!=0){
//        while(i==1){
//            try {
//                if (bookListLibruary.contains(book)){
//                    bookListLibruary.remove(book);
//                    storage.add(book);
//                }
//                i=0;
//                System.out.println("User "+id+" returns book:"+book.getName()+" "+book.getPlaceToRead());
//            } catch(NoSuchElementException e){
//                System.out.println("wait to return book user "+id);
//            }
//        }
//        }
    }

    public void getBook(Book book){
        Book b1=storage.take(book);
        if (!b1.getName().equals("no")){
            if(b1.getPlaceToRead().equals("hand")){
                bookListOnHand.add(b1);
            }
            if (b1.getPlaceToRead().equals("libr")){
                bookListLibruary.add(b1);
            }
            System.out.println("User "+id+" took "+book.getName()+" "+book.getPlaceToRead());
        }
//        book=storage.take(book);
//        int countWaiting=0;
//        while ((!book.getName().equals("no"))||(countWaiting<5)){
//            System.out.println("User "+id+" take book :"+book.getName()+" "+book.getPlaceToRead());
//            if (book.getPlaceToRead().equals("libr")){
//                bookListLibruary.add(book);
//            }
//            if (book.getPlaceToRead().equals("hand")){
//                bookListOnHand.add(book);
//            }
//            countWaiting++;
//            if (countWaiting==5){
//                System.out.println("Cant add user "+id+" book "+book.getName());
//                break;
//            }
//        }
    }
}
