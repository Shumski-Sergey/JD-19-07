package rashkevich.lesson16.Task1;


import java.util.LinkedList;
import java.util.NoSuchElementException;


public class User implements Runnable{
    private LinkedList<String> bookList;
    private BookStorage storage;
    private int id;

    public User(BookStorage storage, int id){
        this.storage=storage;
        this.id=id;
        bookList=new LinkedList<>();
    }

    @Override
    public void run() {
        getBook();
        getBook();
        getBook();
        returnBook();
        returnBook();
        returnBook();
    }

    public void returnBook() {
        int i=1;
        if (bookList.size()!=0){
        while(i==1){
            try {
                String book=bookList.removeLast();
                storage.add(book);
                i=0;
                System.out.println("User "+id+" returns book:"+book);
            } catch(NoSuchElementException e){
                System.out.println("wait to return book user "+id);
            }
        }
        }
    }

    public void getBook(){
        String book=storage.take();
        if (!book.equals("no books")){
            System.out.println("User "+id+" take book :"+book);
            bookList.add(book);
        }
    }
}
