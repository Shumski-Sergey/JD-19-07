package rashkevich.lesson16.Task1;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class BookStorage {
    private LinkedList<String> books;

    public BookStorage(){
        books=new LinkedList<>();
    }

    public void add(String book){
        books.add(book);
    }

    public void printBookStorage(){
        books.stream().forEach(System.out::println);
    }

    public String take(){
        String book=new String();
        if (books.size()!=0){
            int i=1;
            while(i==1){
                try {
                    book = books.removeLast();
                    i=0;
                } catch (NoSuchElementException e){
                    System.out.println("Wait for books");
                    book="no books";
            }

            }
            }
        else {
            System.out.println("Wait for books");
            book="no books";
        }
        return book;
    }
}
